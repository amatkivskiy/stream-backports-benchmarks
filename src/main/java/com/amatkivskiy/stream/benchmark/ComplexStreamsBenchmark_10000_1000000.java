package com.amatkivskiy.stream.benchmark;

import com.annimon.stream.Stream;
import com.annimon.stream.function.Predicate;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.annotations.Warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import java8.util.function.Function;
import java8.util.stream.StreamSupport;
import rx.Observable;
import rx.functions.Func1;
import rx.functions.Func2;
import solid.collections.Pair;

@State(Scope.Thread)
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 10, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@Fork(5)
public class ComplexStreamsBenchmark_10000_1000000 {

  public List<SamplePoJo> inputItems;
  public boolean result = false;

  @Param({"10000", "100000", "1000000"})
  public int itemsCount;

  @Setup(Level.Iteration)
  public void setup() {
    inputItems = new ArrayList<>(itemsCount);

    for (int i = 0; i < itemsCount; i++) {
      inputItems.add(new SamplePoJo(i % 2 == 0, String.valueOf(i), i));
    }
  }

  @TearDown(Level.Iteration)
  public void tearDown() {
    if (!result) throw new IllegalStateException("Some benchmark returned incorrect result.");
  }

  @Benchmark
  public void solidStreams() {
    result = solid.stream.Stream.stream(inputItems)
        .filter(new solid.functions.Func1<SamplePoJo, Boolean>() {
          @Override
          public Boolean call(SamplePoJo samplePoJo) {
            return samplePoJo.booleanValue;
          }
        })
        .map(new solid.functions.Func1<SamplePoJo, Pair<Integer, String>>() {
          @Override
          public Pair<Integer, String> call(SamplePoJo samplePoJo) {
            return new Pair<>(samplePoJo.intValue, samplePoJo.stringValue);
          }
        }).sort(new Comparator<Pair<Integer, String>>() {
          @Override
          public int compare(Pair<Integer, String> one, Pair<Integer, String> another) {
            return Integer.compare(one.first, another.first);
          }
        }).first().get().first == 0;
  }

  @Benchmark
  public void supportStreams() {
    result = StreamSupport.stream(inputItems)
        .filter(new java8.util.function.Predicate<SamplePoJo>() {
          @Override
          public boolean test(SamplePoJo value) {
            return value.booleanValue;
          }
        })
        .map(new Function<SamplePoJo, Pair<Integer, String>>() {
          @Override
          public Pair<Integer, String> apply(SamplePoJo value) {
            return new Pair<>(value.intValue, value.stringValue);
          }
        })
        .sorted(new Comparator<Pair<Integer, String>>() {
          @Override
          public int compare(Pair<Integer, String> one, Pair<Integer, String> another) {
            return Integer.compare(one.first, another.first);
          }
        })
        .findFirst().get().first == 0;
  }

  @Benchmark
  public void lightweightStreams() {
    result = Stream.of(inputItems)
        .filter(new Predicate<SamplePoJo>() {
          @Override
          public boolean test(SamplePoJo samplePoJo) {
            return samplePoJo.booleanValue;
          }
        })
        .map(new com.annimon.stream.function.Function<SamplePoJo, Pair<Integer, String>>() {
          @Override
          public Pair<Integer, String> apply(SamplePoJo samplePoJo) {
            return new Pair<>(samplePoJo.intValue, samplePoJo.stringValue);
          }
        })
        .sorted(new Comparator<Pair<Integer, String>>() {
          @Override
          public int compare(Pair<Integer, String> one, Pair<Integer, String> another) {
            return Integer.compare(one.first, another.first);
          }
        })
        .findFirst().get().first == 0;
  }

  @Benchmark
  public void observable1Streams() {
    result = Observable.from(inputItems)
        .filter(new Func1<SamplePoJo, Boolean>() {
          @Override
          public Boolean call(SamplePoJo samplePoJo) {
            return samplePoJo.booleanValue;
          }
        })
        .map(new Func1<SamplePoJo, Pair<Integer, String>>() {
          @Override
          public Pair<Integer, String> call(SamplePoJo samplePoJo) {
            return new Pair<>(samplePoJo.intValue, samplePoJo.stringValue);
          }
        })
        .sorted(new Func2<Pair<Integer, String>, Pair<Integer, String>, Integer>() {
          @Override
          public Integer call(Pair<Integer, String> one, Pair<Integer, String> another) {
            return Integer.compare(one.first, another.first);
          }
        }).toBlocking().first().first == 0;
  }

  @Benchmark
  public void observable2Streams() {
    result = io.reactivex.Observable.fromIterable(inputItems)
        .filter(new io.reactivex.functions.Predicate<SamplePoJo>() {
          @Override
          public boolean test(SamplePoJo samplePoJo) throws Exception {
            return samplePoJo.booleanValue;
          }
        })
        .map(new io.reactivex.functions.Function<SamplePoJo, Pair<Integer, String>>() {
          @Override
          public Pair<Integer, String> apply(SamplePoJo samplePoJo) throws Exception {
            return new Pair<>(samplePoJo.intValue, samplePoJo.stringValue);
          }
        })
        .sorted(new Comparator<Pair<Integer, String>>() {
          @Override
          public int compare(Pair<Integer, String> one, Pair<Integer, String> another) {
            return Integer.compare(one.first, another.first);
          }
        })
        .blockingFirst().first == 0;
  }

  @Benchmark
  public void simpleLoop() {
    ArrayList<SamplePoJo> filtered = new ArrayList<>();
    for (SamplePoJo value : inputItems) {
      if (value.booleanValue) filtered.add(value);
    }

    ArrayList<Pair<Integer, String>> mapped = new ArrayList<>(filtered.size());
    for (SamplePoJo value : filtered) {
      mapped.add(new Pair<>(value.intValue, value.stringValue));
    }

    Collections.sort(mapped, new Comparator<Pair<Integer, String>>() {
      @Override
      public int compare(Pair<Integer, String> one, Pair<Integer, String> another) {
        return Integer.compare(one.first, another.first);
      }
    });

    result = mapped.get(0) != null && mapped.get(0).first == 0;
  }
}

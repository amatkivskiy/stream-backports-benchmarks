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
import java.util.List;
import java.util.concurrent.TimeUnit;

import java8.util.stream.StreamSupport;
import rx.Observable;
import rx.functions.Func1;

@State(Scope.Thread)
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Warmup(iterations = 10, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@Fork(5)
public class SimpleStreamsBenchmark_1_1000 {

  public List<SamplePoJo> inputItems;
  public boolean result = false;

  @Param({"1", "10", "100", "1000"})
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
        .any(new solid.functions.Func1<SamplePoJo, Boolean>() {
          @Override
          public Boolean call(SamplePoJo value) {
            return value.intValue == inputItems.size() - 1;
          }
        });
  }

  @Benchmark
  public void supportStreams() {
    result = StreamSupport.stream(inputItems)
        .anyMatch(new java8.util.function.Predicate<SamplePoJo>() {
          @Override
          public boolean test(SamplePoJo value) {
            return value.intValue == inputItems.size() - 1;
          }
        });
  }

  @Benchmark
  public void lightweightStreams() {
    result = Stream.of(inputItems)
        .anyMatch(new Predicate<SamplePoJo>() {
          @Override
          public boolean test(SamplePoJo value) {
            return value.intValue == inputItems.size() - 1;
          }
        });
  }

  @Benchmark
  public void observable1Streams() {
    result = Observable.from(inputItems)
        .exists(new Func1<SamplePoJo, Boolean>() {
          @Override
          public Boolean call(SamplePoJo value) {
            return value.intValue == inputItems.size() - 1;
          }
        })
        .toBlocking()
        .first();
  }

  @Benchmark
  public void observable2Streams() {
    result = io.reactivex.Observable.fromIterable(inputItems)
        .any(new io.reactivex.functions.Predicate<SamplePoJo>() {
          @Override
          public boolean test(SamplePoJo value) throws Exception {
            return value.intValue == inputItems.size() - 1;
          }
        })
        .blockingGet();
  }

  @Benchmark
  public void simpleLoop() {
    for (SamplePoJo value : inputItems) {
      if (value.intValue == inputItems.size() - 1) {
        result = true;
      }
    }
  }
}
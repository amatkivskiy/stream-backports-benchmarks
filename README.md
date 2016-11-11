[![CircleCI](https://circleci.com/gh/amatkivskiy/stream-backports-benchmarks.svg?style=svg&circle-token=748bb86f3e2075964cbd04d5927704fef39e3433)](https://circleci.com/gh/amatkivskiy/stream-backports-benchmarks)

Here you can find sources for bechmarks on Java 8 Streams backports. Also you can find the results of latest run [here](https://circleci.com/gh/amatkivskiy/streams-backport-benchmarks). 

#Latest results

```
# Run complete. Total time: 01:54:52

Benchmark                                                 (itemsCount)   Mode  Cnt    Score    Error   Units
ComplexStreamsBenchmark_10000_1000000.lightweightStreams         10000  thrpt   50    3.405 ±  0.062  ops/ms
ComplexStreamsBenchmark_10000_1000000.lightweightStreams        100000  thrpt   50    0.361 ±  0.006  ops/ms
ComplexStreamsBenchmark_10000_1000000.lightweightStreams       1000000  thrpt   50    0.035 ±  0.001  ops/ms
ComplexStreamsBenchmark_10000_1000000.observable1Streams         10000  thrpt   50    2.738 ±  0.109  ops/ms
ComplexStreamsBenchmark_10000_1000000.observable1Streams        100000  thrpt   50    0.455 ±  0.019  ops/ms
ComplexStreamsBenchmark_10000_1000000.observable1Streams       1000000  thrpt   50    0.048 ±  0.001  ops/ms
ComplexStreamsBenchmark_10000_1000000.observable2Streams         10000  thrpt   50    3.316 ±  0.194  ops/ms
ComplexStreamsBenchmark_10000_1000000.observable2Streams        100000  thrpt   50    0.499 ±  0.017  ops/ms
ComplexStreamsBenchmark_10000_1000000.observable2Streams       1000000  thrpt   50    0.046 ±  0.002  ops/ms
ComplexStreamsBenchmark_10000_1000000.simpleLoop                 10000  thrpt   50    5.029 ±  0.349  ops/ms
ComplexStreamsBenchmark_10000_1000000.simpleLoop                100000  thrpt   50    0.569 ±  0.020  ops/ms
ComplexStreamsBenchmark_10000_1000000.simpleLoop               1000000  thrpt   50    0.039 ±  0.001  ops/ms
ComplexStreamsBenchmark_10000_1000000.solidStreams               10000  thrpt   50    4.828 ±  0.151  ops/ms
ComplexStreamsBenchmark_10000_1000000.solidStreams              100000  thrpt   50    0.511 ±  0.031  ops/ms
ComplexStreamsBenchmark_10000_1000000.solidStreams             1000000  thrpt   50    0.048 ±  0.001  ops/ms
ComplexStreamsBenchmark_10000_1000000.supportStreams             10000  thrpt   50    4.310 ±  0.099  ops/ms
ComplexStreamsBenchmark_10000_1000000.supportStreams            100000  thrpt   50    0.558 ±  0.010  ops/ms
ComplexStreamsBenchmark_10000_1000000.supportStreams           1000000  thrpt   50    0.055 ±  0.001  ops/ms
ComplexStreamsBenchmark_1_1000.lightweightStreams                    1  thrpt   50    0.082 ±  0.020  ops/us
ComplexStreamsBenchmark_1_1000.lightweightStreams                   10  thrpt   50    0.091 ±  0.036  ops/us
ComplexStreamsBenchmark_1_1000.lightweightStreams                  100  thrpt   50    0.004 ±  0.001  ops/us
ComplexStreamsBenchmark_1_1000.lightweightStreams                 1000  thrpt   50    0.019 ±  0.003  ops/us
ComplexStreamsBenchmark_1_1000.observable1Streams                    1  thrpt   50    0.011 ±  0.001  ops/us
ComplexStreamsBenchmark_1_1000.observable1Streams                   10  thrpt   50    0.009 ±  0.001  ops/us
ComplexStreamsBenchmark_1_1000.observable1Streams                  100  thrpt   50    0.003 ±  0.001  ops/us
ComplexStreamsBenchmark_1_1000.observable1Streams                 1000  thrpt   50    0.007 ±  0.001  ops/us
ComplexStreamsBenchmark_1_1000.observable2Streams                    1  thrpt   50    0.038 ±  0.002  ops/us
ComplexStreamsBenchmark_1_1000.observable2Streams                   10  thrpt   50    0.028 ±  0.005  ops/us
ComplexStreamsBenchmark_1_1000.observable2Streams                  100  thrpt   50    0.007 ±  0.005  ops/us
ComplexStreamsBenchmark_1_1000.observable2Streams                 1000  thrpt   50    0.018 ±  0.001  ops/us
ComplexStreamsBenchmark_1_1000.simpleLoop                            1  thrpt   50    8.188 ±  2.011  ops/us
ComplexStreamsBenchmark_1_1000.simpleLoop                           10  thrpt   50    3.595 ±  0.395  ops/us
ComplexStreamsBenchmark_1_1000.simpleLoop                          100  thrpt   50    0.118 ±  0.038  ops/us
ComplexStreamsBenchmark_1_1000.simpleLoop                         1000  thrpt   50    0.031 ±  0.002  ops/us
ComplexStreamsBenchmark_1_1000.solidStreams                          1  thrpt   50    0.130 ±  0.044  ops/us
ComplexStreamsBenchmark_1_1000.solidStreams                         10  thrpt   50    0.088 ±  0.040  ops/us
ComplexStreamsBenchmark_1_1000.solidStreams                        100  thrpt   50    0.019 ±  0.016  ops/us
ComplexStreamsBenchmark_1_1000.solidStreams                       1000  thrpt   50    0.031 ±  0.004  ops/us
ComplexStreamsBenchmark_1_1000.supportStreams                        1  thrpt   50    0.036 ±  0.001  ops/us
ComplexStreamsBenchmark_1_1000.supportStreams                       10  thrpt   50    0.025 ±  0.003  ops/us
ComplexStreamsBenchmark_1_1000.supportStreams                      100  thrpt   50    0.004 ±  0.001  ops/us
ComplexStreamsBenchmark_1_1000.supportStreams                     1000  thrpt   50    0.017 ±  0.002  ops/us
SimpleStreamsBenchmark_10000_1000000.lightweightStreams          10000  thrpt   50   12.066 ±  0.161  ops/ms
SimpleStreamsBenchmark_10000_1000000.lightweightStreams         100000  thrpt   50    0.973 ±  0.008  ops/ms
SimpleStreamsBenchmark_10000_1000000.lightweightStreams        1000000  thrpt   50    0.089 ±  0.003  ops/ms
SimpleStreamsBenchmark_10000_1000000.observable1Streams          10000  thrpt   50    8.390 ±  0.469  ops/ms
SimpleStreamsBenchmark_10000_1000000.observable1Streams         100000  thrpt   50    1.309 ±  0.046  ops/ms
SimpleStreamsBenchmark_10000_1000000.observable1Streams        1000000  thrpt   50    0.110 ±  0.001  ops/ms
SimpleStreamsBenchmark_10000_1000000.observable2Streams          10000  thrpt   50    8.946 ±  0.095  ops/ms
SimpleStreamsBenchmark_10000_1000000.observable2Streams         100000  thrpt   50    0.961 ±  0.010  ops/ms
SimpleStreamsBenchmark_10000_1000000.observable2Streams        1000000  thrpt   50    0.087 ±  0.001  ops/ms
SimpleStreamsBenchmark_10000_1000000.simpleLoop                  10000  thrpt   50   39.592 ±  0.642  ops/ms
SimpleStreamsBenchmark_10000_1000000.simpleLoop                 100000  thrpt   50    3.924 ±  0.085  ops/ms
SimpleStreamsBenchmark_10000_1000000.simpleLoop                1000000  thrpt   50    0.156 ±  0.002  ops/ms
SimpleStreamsBenchmark_10000_1000000.solidStreams                10000  thrpt   50   36.849 ±  1.712  ops/ms
SimpleStreamsBenchmark_10000_1000000.solidStreams               100000  thrpt   50    3.500 ±  0.170  ops/ms
SimpleStreamsBenchmark_10000_1000000.solidStreams              1000000  thrpt   50    0.156 ±  0.002  ops/ms
SimpleStreamsBenchmark_10000_1000000.supportStreams              10000  thrpt   50   15.126 ±  0.831  ops/ms
SimpleStreamsBenchmark_10000_1000000.supportStreams             100000  thrpt   50    1.763 ±  0.052  ops/ms
SimpleStreamsBenchmark_10000_1000000.supportStreams            1000000  thrpt   50    0.122 ±  0.002  ops/ms
SimpleStreamsBenchmark_1_1000.lightweightStreams                     1  thrpt   50   41.379 ±  2.508  ops/us
SimpleStreamsBenchmark_1_1000.lightweightStreams                    10  thrpt   50   10.379 ±  0.380  ops/us
SimpleStreamsBenchmark_1_1000.lightweightStreams                   100  thrpt   50    0.581 ±  0.045  ops/us
SimpleStreamsBenchmark_1_1000.lightweightStreams                  1000  thrpt   50    0.092 ±  0.008  ops/us
SimpleStreamsBenchmark_1_1000.observable1Streams                     1  thrpt   50    0.025 ±  0.002  ops/us
SimpleStreamsBenchmark_1_1000.observable1Streams                    10  thrpt   50    0.020 ±  0.002  ops/us
SimpleStreamsBenchmark_1_1000.observable1Streams                   100  thrpt   50    0.021 ±  0.004  ops/us
SimpleStreamsBenchmark_1_1000.observable1Streams                  1000  thrpt   50    0.021 ±  0.001  ops/us
SimpleStreamsBenchmark_1_1000.observable2Streams                     1  thrpt   50    0.136 ±  0.003  ops/us
SimpleStreamsBenchmark_1_1000.observable2Streams                    10  thrpt   50    0.499 ±  0.504  ops/us
SimpleStreamsBenchmark_1_1000.observable2Streams                   100  thrpt   50    0.159 ±  0.006  ops/us
SimpleStreamsBenchmark_1_1000.observable2Streams                  1000  thrpt   50    0.062 ±  0.002  ops/us
SimpleStreamsBenchmark_1_1000.simpleLoop                             1  thrpt   50  148.908 ±  2.842  ops/us
SimpleStreamsBenchmark_1_1000.simpleLoop                            10  thrpt   50   44.456 ±  2.698  ops/us
SimpleStreamsBenchmark_1_1000.simpleLoop                           100  thrpt   50    6.494 ±  0.301  ops/us
SimpleStreamsBenchmark_1_1000.simpleLoop                          1000  thrpt   50    0.595 ±  0.059  ops/us
SimpleStreamsBenchmark_1_1000.solidStreams                           1  thrpt   50  255.282 ±  7.468  ops/us
SimpleStreamsBenchmark_1_1000.solidStreams                          10  thrpt   50   38.477 ±  1.619  ops/us
SimpleStreamsBenchmark_1_1000.solidStreams                         100  thrpt   50    3.710 ±  1.653  ops/us
SimpleStreamsBenchmark_1_1000.solidStreams                        1000  thrpt   50    0.441 ±  0.063  ops/us
SimpleStreamsBenchmark_1_1000.supportStreams                         1  thrpt   50    0.119 ±  0.010  ops/us
SimpleStreamsBenchmark_1_1000.supportStreams                        10  thrpt   50    0.152 ±  0.007  ops/us
SimpleStreamsBenchmark_1_1000.supportStreams                       100  thrpt   50    0.120 ±  0.023  ops/us
SimpleStreamsBenchmark_1_1000.supportStreams                      1000  thrpt   50    0.080 ±  0.003  ops/us
```

## Why do you have so strange benchmark classes names?
Like this:

```
- ComplexStreamsBenchmark_10000_1000000
- ComplexStreamsBenchmark_1_1000
- SimpleStreamsBenchmark_10000_1000000
- SimpleStreamsBenchmark_1_1000
```

Thats because different number of items requires different units to measure it. For example measuring perfomance on 1000000 items in `ops/us` will result on really large values and therefore large error level. So I decided to split benchmarks by number of items on which they run. 
If anyone knows better solution -> feel free craete PR and submit it.


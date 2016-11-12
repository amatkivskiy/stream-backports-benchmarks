[![CircleCI](https://circleci.com/gh/amatkivskiy/stream-backports-benchmarks.svg?style=svg&circle-token=748bb86f3e2075964cbd04d5927704fef39e3433)](https://circleci.com/gh/amatkivskiy/stream-backports-benchmarks)

Here you can find sources for bechmarks on Java 8 Streams backports. Also you can find the results of latest run [here](https://circleci.com/gh/amatkivskiy/streams-backport-benchmarks). 

#Latest results in csv format
https://5-73061278-gh.circle-artifacts.com/0/tmp/circle-artifacts.ziSNif2/results.csv

#Latest text results

```
# Run complete. Total time: 01:55:03

Benchmark                                                 (itemsCount)   Mode  Cnt    Score    Error   Units
ComplexStreamsBenchmark_10000_1000000.lightweightStreams         10000  thrpt   50    3.588 ±  0.148  ops/ms
ComplexStreamsBenchmark_10000_1000000.lightweightStreams        100000  thrpt   50    0.374 ±  0.015  ops/ms
ComplexStreamsBenchmark_10000_1000000.lightweightStreams       1000000  thrpt   50    0.040 ±  0.002  ops/ms
ComplexStreamsBenchmark_10000_1000000.observable1Streams         10000  thrpt   50    2.938 ±  0.061  ops/ms
ComplexStreamsBenchmark_10000_1000000.observable1Streams        100000  thrpt   50    0.474 ±  0.017  ops/ms
ComplexStreamsBenchmark_10000_1000000.observable1Streams       1000000  thrpt   50    0.050 ±  0.002  ops/ms
ComplexStreamsBenchmark_10000_1000000.observable2Streams         10000  thrpt   50    3.483 ±  0.321  ops/ms
ComplexStreamsBenchmark_10000_1000000.observable2Streams        100000  thrpt   50    0.525 ±  0.017  ops/ms
ComplexStreamsBenchmark_10000_1000000.observable2Streams       1000000  thrpt   50    0.049 ±  0.003  ops/ms
ComplexStreamsBenchmark_10000_1000000.simpleLoop                 10000  thrpt   50    5.426 ±  0.284  ops/ms
ComplexStreamsBenchmark_10000_1000000.simpleLoop                100000  thrpt   50    0.500 ±  0.038  ops/ms
ComplexStreamsBenchmark_10000_1000000.simpleLoop               1000000  thrpt   50    0.037 ±  0.002  ops/ms
ComplexStreamsBenchmark_10000_1000000.solidStreams               10000  thrpt   50    5.073 ±  0.134  ops/ms
ComplexStreamsBenchmark_10000_1000000.solidStreams              100000  thrpt   50    0.517 ±  0.052  ops/ms
ComplexStreamsBenchmark_10000_1000000.solidStreams             1000000  thrpt   50    0.047 ±  0.002  ops/ms
ComplexStreamsBenchmark_10000_1000000.supportStreams             10000  thrpt   50    4.502 ±  0.101  ops/ms
ComplexStreamsBenchmark_10000_1000000.supportStreams            100000  thrpt   50    0.551 ±  0.015  ops/ms
ComplexStreamsBenchmark_10000_1000000.supportStreams           1000000  thrpt   50    0.054 ±  0.002  ops/ms
ComplexStreamsBenchmark_1_1000.lightweightStreams                    1  thrpt   50    0.094 ±  0.035  ops/us
ComplexStreamsBenchmark_1_1000.lightweightStreams                   10  thrpt   50    0.146 ±  0.050  ops/us
ComplexStreamsBenchmark_1_1000.lightweightStreams                  100  thrpt   50    0.004 ±  0.001  ops/us
ComplexStreamsBenchmark_1_1000.lightweightStreams                 1000  thrpt   50    0.020 ±  0.004  ops/us
ComplexStreamsBenchmark_1_1000.observable1Streams                    1  thrpt   50    0.012 ±  0.001  ops/us
ComplexStreamsBenchmark_1_1000.observable1Streams                   10  thrpt   50    0.009 ±  0.001  ops/us
ComplexStreamsBenchmark_1_1000.observable1Streams                  100  thrpt   50    0.003 ±  0.001  ops/us
ComplexStreamsBenchmark_1_1000.observable1Streams                 1000  thrpt   50    0.008 ±  0.001  ops/us
ComplexStreamsBenchmark_1_1000.observable2Streams                    1  thrpt   50    0.042 ±  0.002  ops/us
ComplexStreamsBenchmark_1_1000.observable2Streams                   10  thrpt   50    0.029 ±  0.005  ops/us
ComplexStreamsBenchmark_1_1000.observable2Streams                  100  thrpt   50    0.012 ±  0.006  ops/us
ComplexStreamsBenchmark_1_1000.observable2Streams                 1000  thrpt   50    0.018 ±  0.002  ops/us
ComplexStreamsBenchmark_1_1000.simpleLoop                            1  thrpt   50    6.084 ±  2.249  ops/us
ComplexStreamsBenchmark_1_1000.simpleLoop                           10  thrpt   50    3.447 ±  0.587  ops/us
ComplexStreamsBenchmark_1_1000.simpleLoop                          100  thrpt   50    0.135 ±  0.037  ops/us
ComplexStreamsBenchmark_1_1000.simpleLoop                         1000  thrpt   50    0.035 ±  0.005  ops/us
ComplexStreamsBenchmark_1_1000.solidStreams                          1  thrpt   50    0.223 ±  0.197  ops/us
ComplexStreamsBenchmark_1_1000.solidStreams                         10  thrpt   50    0.195 ±  0.158  ops/us
ComplexStreamsBenchmark_1_1000.solidStreams                        100  thrpt   50    0.040 ±  0.021  ops/us
ComplexStreamsBenchmark_1_1000.solidStreams                       1000  thrpt   50    0.032 ±  0.004  ops/us
ComplexStreamsBenchmark_1_1000.supportStreams                        1  thrpt   50    0.035 ±  0.004  ops/us
ComplexStreamsBenchmark_1_1000.supportStreams                       10  thrpt   50    0.033 ±  0.007  ops/us
ComplexStreamsBenchmark_1_1000.supportStreams                      100  thrpt   50    0.006 ±  0.004  ops/us
ComplexStreamsBenchmark_1_1000.supportStreams                     1000  thrpt   50    0.018 ±  0.002  ops/us
SimpleStreamsBenchmark_10000_1000000.lightweightStreams          10000  thrpt   50   11.548 ±  0.832  ops/ms
SimpleStreamsBenchmark_10000_1000000.lightweightStreams         100000  thrpt   50    1.055 ±  0.059  ops/ms
SimpleStreamsBenchmark_10000_1000000.lightweightStreams        1000000  thrpt   50    0.089 ±  0.001  ops/ms
SimpleStreamsBenchmark_10000_1000000.observable1Streams          10000  thrpt   50    9.194 ±  0.143  ops/ms
SimpleStreamsBenchmark_10000_1000000.observable1Streams         100000  thrpt   50    1.312 ±  0.045  ops/ms
SimpleStreamsBenchmark_10000_1000000.observable1Streams        1000000  thrpt   50    0.110 ±  0.001  ops/ms
SimpleStreamsBenchmark_10000_1000000.observable2Streams          10000  thrpt   50    9.331 ±  0.225  ops/ms
SimpleStreamsBenchmark_10000_1000000.observable2Streams         100000  thrpt   50    0.975 ±  0.013  ops/ms
SimpleStreamsBenchmark_10000_1000000.observable2Streams        1000000  thrpt   50    0.087 ±  0.003  ops/ms
SimpleStreamsBenchmark_10000_1000000.simpleLoop                  10000  thrpt   50   42.335 ±  1.221  ops/ms
SimpleStreamsBenchmark_10000_1000000.simpleLoop                 100000  thrpt   50    3.549 ±  0.145  ops/ms
SimpleStreamsBenchmark_10000_1000000.simpleLoop                1000000  thrpt   50    0.155 ±  0.002  ops/ms
SimpleStreamsBenchmark_10000_1000000.solidStreams                10000  thrpt   50   40.490 ±  0.396  ops/ms
SimpleStreamsBenchmark_10000_1000000.solidStreams               100000  thrpt   50    3.685 ±  0.073  ops/ms
SimpleStreamsBenchmark_10000_1000000.solidStreams              1000000  thrpt   50    0.155 ±  0.001  ops/ms
SimpleStreamsBenchmark_10000_1000000.supportStreams              10000  thrpt   50   16.462 ±  0.501  ops/ms
SimpleStreamsBenchmark_10000_1000000.supportStreams             100000  thrpt   50    1.754 ±  0.055  ops/ms
SimpleStreamsBenchmark_10000_1000000.supportStreams            1000000  thrpt   50    0.121 ±  0.001  ops/ms
SimpleStreamsBenchmark_1_1000.lightweightStreams                     1  thrpt   50   35.810 ±  6.318  ops/us
SimpleStreamsBenchmark_1_1000.lightweightStreams                    10  thrpt   50   11.070 ±  0.308  ops/us
SimpleStreamsBenchmark_1_1000.lightweightStreams                   100  thrpt   50    0.583 ±  0.051  ops/us
SimpleStreamsBenchmark_1_1000.lightweightStreams                  1000  thrpt   50    0.103 ±  0.009  ops/us
SimpleStreamsBenchmark_1_1000.observable1Streams                     1  thrpt   50    0.026 ±  0.002  ops/us
SimpleStreamsBenchmark_1_1000.observable1Streams                    10  thrpt   50    0.023 ±  0.003  ops/us
SimpleStreamsBenchmark_1_1000.observable1Streams                   100  thrpt   50    0.023 ±  0.004  ops/us
SimpleStreamsBenchmark_1_1000.observable1Streams                  1000  thrpt   50    0.021 ±  0.002  ops/us
SimpleStreamsBenchmark_1_1000.observable2Streams                     1  thrpt   50    0.816 ±  1.026  ops/us
SimpleStreamsBenchmark_1_1000.observable2Streams                    10  thrpt   50    0.619 ±  0.678  ops/us
SimpleStreamsBenchmark_1_1000.observable2Streams                   100  thrpt   50    0.164 ±  0.002  ops/us
SimpleStreamsBenchmark_1_1000.observable2Streams                  1000  thrpt   50    0.063 ±  0.004  ops/us
SimpleStreamsBenchmark_1_1000.simpleLoop                             1  thrpt   50  153.100 ± 10.403  ops/us
SimpleStreamsBenchmark_1_1000.simpleLoop                            10  thrpt   50   48.807 ±  1.603  ops/us
SimpleStreamsBenchmark_1_1000.simpleLoop                           100  thrpt   50    7.230 ±  0.242  ops/us
SimpleStreamsBenchmark_1_1000.simpleLoop                          1000  thrpt   50    0.637 ±  0.079  ops/us
SimpleStreamsBenchmark_1_1000.solidStreams                           1  thrpt   50  269.581 ± 13.140  ops/us
SimpleStreamsBenchmark_1_1000.solidStreams                          10  thrpt   50   40.096 ±  3.435  ops/us
SimpleStreamsBenchmark_1_1000.solidStreams                         100  thrpt   50    5.581 ±  1.564  ops/us
SimpleStreamsBenchmark_1_1000.solidStreams                        1000  thrpt   50    0.424 ±  0.049  ops/us
SimpleStreamsBenchmark_1_1000.supportStreams                         1  thrpt   50    0.129 ±  0.017  ops/us
SimpleStreamsBenchmark_1_1000.supportStreams                        10  thrpt   50    0.163 ±  0.003  ops/us
SimpleStreamsBenchmark_1_1000.supportStreams                       100  thrpt   50    0.141 ±  0.011  ops/us
SimpleStreamsBenchmark_1_1000.supportStreams                      1000  thrpt   50    0.081 ±  0.005  ops/us
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


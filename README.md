# Quicksort — Practice

Three practice problems that use the partition step for something other than a full sort: find the kth largest value, sort an array of three colors in place, and partition with a single forward sweep. Each problem has a JUnit suite.

## Prerequisites

- JDK 17+
- The JUnit jar is already vendored in `lib/`; there is nothing to download.

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  lib/
    junit-platform-console-standalone-6.1.0.jar
  src/
    main/
      practice/
        QuickSelect.java                # kth largest by narrowing partitions
        SortColorsCounting.java         # counting pass
        SortColorsThreeWay.java         # Dutch national flag, one pass
        LomutoPartition.java            # one-marker sweep partition
    test/
      practice/
        QuickSelectTest.java
        SortColorsTest.java             # the scenarios both solutions share
        SortColorsCountingTest.java     # runs them against the counting solution
        SortColorsThreeWayTest.java     # runs them against the three-way solution
        LomutoPartitionTest.java
  scripts/
    test.sh                             # compile and run the JUnit tests
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite.
- `scripts/test.sh practice.SortColorsThreeWayTest` — compiles everything and runs only that test class.

## What's here

- `practice.QuickSelect` — `findKthLargest`, which partitions and then continues into only the side that holds the answer.
- `practice.SortColorsCounting` — `sortColors`, which tallies the colors and rewrites the array.
- `practice.SortColorsThreeWay` — `sortColors`, a single-pass three-way partition with three markers.
- `practice.LomutoPartition` — `lomutoPartition`, which partitions a slice with one forward sweep.
- `practice.QuickSelectTest` and `practice.LomutoPartitionTest` — one suite per problem.
- `practice.SortColorsTest` and its two subclasses — the sort colors scenarios, run once per solution.

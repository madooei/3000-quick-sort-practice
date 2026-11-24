# Quicksort — Practice

Three practice problems that use the partition step for something other than a full sort: find the kth largest value, sort an array of three colors in place, and partition with a single forward sweep. Each problem has a JUnit suite, and each solution class has a demo.

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
        SortColorsThreeWay.java         # Dutch national flag, one pass
        LomutoPartition.java            # one-marker sweep partition
      demo/                             # one demo per solution class
        QuickSelectDemo.java
        SortColorsThreeWayDemo.java
        LomutoPartitionDemo.java
    test/
      practice/
        QuickSelectTest.java
        SortColorsTest.java             # the sort colors scenarios
        SortColorsThreeWayTest.java     # runs them against the three-way solution
        LomutoPartitionTest.java
  scripts/
    test.sh                             # compile and run the JUnit tests
    run.sh                              # compile and run one demo
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite.
- `scripts/test.sh practice.SortColorsThreeWayTest` — compiles everything and runs only that test class.
- `scripts/run.sh demo.QuickSelectDemo` — compiles everything and runs that one demo. Every problem class has its own demo, `<Class>Demo`.

## What's here

- `practice.QuickSelect` — `findKthLargest`, which partitions and then continues into only the side that holds the answer.
- `practice.SortColorsThreeWay` — `sort`, a single-pass three-way partition with three markers.
- `practice.LomutoPartition` — `partition`, which partitions a slice with one forward sweep.
- `practice.QuickSelectTest` and `practice.LomutoPartitionTest` — one suite per problem.
- `practice.SortColorsTest` and its subclass `practice.SortColorsThreeWayTest` — the sort colors scenarios, run against the three-way solution.
- `demo.QuickSelectDemo`, `demo.SortColorsThreeWayDemo`, and `demo.LomutoPartitionDemo` — one demo per solution class, each on an example from the notes.

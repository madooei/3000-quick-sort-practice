package demo;

import java.util.Arrays;
import practice.LomutoPartition;

/** A demo of LomutoPartition on the example the notes trace. */
public final class LomutoPartitionDemo {

  private LomutoPartitionDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] arr = {3, 1, 5, 2, 4};
    System.out.println("before: " + Arrays.toString(arr));

    // The pivot is 4, the last element. Expect [3, 1, 2, 4, 5] and index 3.
    int pivotIndex = LomutoPartition.lomutoPartition(arr, 0, arr.length - 1);
    System.out.println("after:  " + Arrays.toString(arr));
    System.out.println("pivot index: " + pivotIndex);
  }
}

package practice;

import java.util.Arrays;

/** A demo of QuickSelect on the example the notes trace. */
public final class QuickSelectDemo {

  private QuickSelectDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] numbers = {3, 1, 5, 2, 4};
    int k = 4;
    System.out.println("numbers: " + Arrays.toString(numbers) + ", k = " + k);

    // Sorted, the values are 1 2 3 4 5, so the 4th largest is 2.
    int answer = QuickSelect.findKthLargest(numbers, k);
    System.out.println("4th largest: " + answer);

    // findKthLargest rearranges numbers as it partitions.
    System.out.println("numbers after: " + Arrays.toString(numbers));
  }
}

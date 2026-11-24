package demo;

import java.util.Arrays;
import practice.SortColorsCounting;

/** A demo of SortColorsCounting on the notes' first example. */
public final class SortColorsCountingDemo {

  private SortColorsCountingDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] colors = {2, 0, 2, 1, 1, 0};
    System.out.println("before: " + Arrays.toString(colors));

    // Expect [0, 0, 1, 1, 2, 2].
    SortColorsCounting.sortColors(colors);
    System.out.println("after:  " + Arrays.toString(colors));
  }
}

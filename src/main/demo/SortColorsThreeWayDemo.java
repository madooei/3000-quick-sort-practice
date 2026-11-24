package demo;

import java.util.Arrays;
import practice.SortColorsThreeWay;

/** A demo of SortColorsThreeWay on the notes' first example. */
public final class SortColorsThreeWayDemo {

  private SortColorsThreeWayDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] colors = {2, 0, 2, 1, 1, 0};
    System.out.println("before: " + Arrays.toString(colors));

    // Expect [0, 0, 1, 1, 2, 2].
    SortColorsThreeWay.sort(colors);
    System.out.println("after:  " + Arrays.toString(colors));
  }
}

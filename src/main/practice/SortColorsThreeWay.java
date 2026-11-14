package practice;

/** Practice problem: sort an array of 0s, 1s, and 2s in a single pass. */
public final class SortColorsThreeWay {

  private SortColorsThreeWay() {
    // This class should not be instantiated!
  }

  // Sorts colors in ascending order in a single pass, by moving values within
  // the array. Assumes every element of colors is 0, 1, or 2.
  public static void sortColors(int[] colors) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}

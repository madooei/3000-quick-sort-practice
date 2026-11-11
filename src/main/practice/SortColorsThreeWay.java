package practice;

/** Practice problem: sort an array of 0s, 1s, and 2s in a single pass. */
public final class SortColorsThreeWay {

  private SortColorsThreeWay() {
    // This class should not be instantiated!
  }

  // Sorts colors in ascending order in a single pass, by moving values within
  // the array. Assumes every element of colors is 0, 1, or 2.
  public static void sortColors(int[] colors) {
    int lo = 0;                     // 0s end before lo
    int mid = 0;                    // 1s fill colors[lo..mid-1]; mid is the current value
    int hi = colors.length - 1;     // 2s start after hi

    while (mid <= hi) {
      if (colors[mid] == 0) {
        swap(colors, lo, mid);      // send the 0 to the front region
        lo++;
        mid++;
      } else if (colors[mid] == 1) {
        mid++;                       // a 1 is already in place
      } else {
        swap(colors, mid, hi);      // send the 2 to the back region
        hi--;
      }
    }
  }

  private static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
}

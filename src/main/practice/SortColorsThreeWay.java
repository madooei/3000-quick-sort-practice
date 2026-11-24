package practice;

/** Practice problem: sort an array of 0s, 1s, and 2s in a single pass. */
public final class SortColorsThreeWay {

  private SortColorsThreeWay() {
    // This class should not be instantiated!
  }

  // Sorts colors in ascending order in a single pass, by moving values within
  // the array. Assumes every element of colors is 0, 1, or 2.
  public static void sort(int[] colors) {
    int lo = 0;                     // the red region is left of lo
    int mid = 0;                    // the white region is colors[lo..mid-1]; mid is the first unsorted value
    int hi = colors.length - 1;     // the blue region is right of hi

    while (mid <= hi) {
      if (colors[mid] == 0) {
        swap(colors, lo, mid);      // move the 0 to the end of the red region
        lo++;
        mid++;
      } else if (colors[mid] == 1) {
        mid++;                      // the 1 is already at the end of the white region
      } else {
        swap(colors, mid, hi);      // move the 2 to the front of the blue region
        hi--;                       // mid stays: the value from hi is unsorted
      }
    }
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}

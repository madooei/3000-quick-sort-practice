package practice;

/** Practice problem: sort an array whose only values are 0, 1, and 2. */
public final class SortColors {

  private SortColors() {
    // This class should not be instantiated!
  }

  // Sorts colors in ascending order by counting each value.
  // Assumes every element of colors is 0, 1, or 2.
  public static void sortColorsCounting(int[] colors) {
    int zeros = 0, ones = 0, twos = 0;
    for (int c : colors) {          // first pass: tally each color
      if (c == 0) {
        zeros++;
      } else if (c == 1) {
        ones++;
      } else {
        twos++;
      }
    }

    int i = 0;                      // second pass: overwrite in order
    while (zeros-- > 0) {
      colors[i++] = 0;
    }
    while (ones-- > 0) {
      colors[i++] = 1;
    }
    while (twos-- > 0) {
      colors[i++] = 2;
    }
  }

  // Sorts colors in ascending order in a single pass, by moving values within
  // the array. Assumes every element of colors is 0, 1, or 2.
  public static void sortColorsThreeWay(int[] colors) {
    int lo = 0;                     // 0s end before lo
    int mid = 0;                    // 1s fill [lo, mid); mid is the current value
    int hi = colors.length - 1;     // 2s start after hi

    while (mid <= hi) {
      if (colors[mid] == 0) {
        swap(colors, lo, mid);      // send the 0 to the front region
        lo++;
        mid++;
      } else if (colors[mid] == 1) {
        mid++;                       // a 1 is already home
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

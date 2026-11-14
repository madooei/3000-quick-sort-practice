package practice;

/** Practice problem: sort an array of 0s, 1s, and 2s by counting each value. */
public final class SortColorsCounting {

  private SortColorsCounting() {
    // This class should not be instantiated!
  }

  // Sorts colors in ascending order by counting each value.
  // Assumes every element of colors is 0, 1, or 2.
  public static void sortColors(int[] colors) {
    int zeros = 0, ones = 0, twos = 0;
    for (int color : colors) {      // first pass: tally each color
      if (color == 0) {
        zeros++;
      } else if (color == 1) {
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
}

package practice;

/** Practice problem: the kth largest value of an array, found without sorting it. */
public final class QuickSelect {

  private QuickSelect() {
    // This class should not be instantiated!
  }

  // Returns the kth largest value of numbers, where k = 1 is the largest.
  // Rearranges numbers. Assumes numbers is not empty and 1 <= k <= numbers.length.
  public static int findKthLargest(int[] numbers, int k) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Partitions a[lo..hi] around a[hi] and returns the pivot's final index.
  // Pre: lo <= hi.
  private static int partition(int[] a, int lo, int hi) {
    int pivot = a[hi];
    int l = lo;
    int r = hi - 1;

    while (l <= r) {
      while (l <= r && a[l] < pivot) {
        l++;
      }
      while (l <= r && a[r] > pivot) {
        r--;
      }
      if (l <= r) {
        swap(a, l, r);
        l++;
        r--;
      }
    }

    swap(a, l, hi);
    return l;
  }

  private static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
}

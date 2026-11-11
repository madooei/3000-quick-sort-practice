package practice;

/** Practice problem: partition a slice with Lomuto's scheme. */
public final class LomutoPartition {

  private LomutoPartition() {
    // This class should not be instantiated!
  }

  // Partitions a[lo..hi] around a[hi] and returns the pivot's final index p.
  // Every value in a[lo..p-1] is at most the pivot, and every value in
  // a[p+1..hi] is greater than the pivot. Assumes lo <= hi.
  public static int lomutoPartition(int[] a, int lo, int hi) {
    int pivot = a[hi];              // the last element is the pivot
    int mark = lo;                  // a[lo..mark) is known to be <= pivot

    for (int i = lo; i < hi; i++) {
      if (a[i] <= pivot) {
        swap(a, i, mark);           // grow the <= region by one
        mark++;
      }
    }

    swap(a, mark, hi);              // drop the pivot just after that region
    return mark;
  }

  private static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
}

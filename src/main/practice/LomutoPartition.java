package practice;

/** Practice problem: partition a slice with Lomuto's scheme. */
public final class LomutoPartition {

  private LomutoPartition() {
    // This class should not be instantiated!
  }

  // Partitions arr[lo..hi] around arr[hi] and returns pivotIndex, the pivot's
  // final index. Every value in arr[lo..pivotIndex-1] is at most the pivot,
  // and every value in arr[pivotIndex+1..hi] is greater than the pivot.
  // Assumes lo <= hi.
  public static int lomutoPartition(int[] arr, int lo, int hi) {
    int pivot = hi;                 // index of the pivot, the last element
    int mark = lo;                  // arr[lo..mark-1] is known to be <= pivot

    for (int i = lo; i < hi; i++) {
      if (arr[i] <= arr[pivot]) {
        swap(arr, i, mark);         // grow the <= region by one
        mark++;
      }
    }

    swap(arr, mark, pivot);         // drop the pivot just after that region
    return mark;
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}

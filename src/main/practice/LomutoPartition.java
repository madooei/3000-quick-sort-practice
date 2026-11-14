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
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}

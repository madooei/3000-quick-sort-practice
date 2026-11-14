package practice;

/** Practice problem: the kth largest value of an array, found without sorting it. */
public final class QuickSelect {

  private QuickSelect() {
    // This class should not be instantiated!
  }

  // Returns the kth largest value of numbers, where k = 1 is the largest.
  // Rearranges numbers. Assumes numbers is not empty and 1 <= k <= numbers.length.
  public static int findKthLargest(int[] numbers, int k) {
    int target = numbers.length - k;   // the kth largest sits here once sorted
    int lo = 0;
    int hi = numbers.length - 1;

    while (lo < hi) {
      int pivotIndex = partition(numbers, lo, hi);
      if (pivotIndex == target) {
        return numbers[pivotIndex];      // pivot landed exactly on the answer
      } else if (pivotIndex < target) {
        lo = pivotIndex + 1;             // answer is in the right side
      } else {
        hi = pivotIndex - 1;             // answer is in the left side
      }
    }
    return numbers[lo];                  // slice narrowed to a single element
  }

  // Partitions arr[lo..hi] around arr[hi] and returns the pivot's final index.
  // Pre: lo <= hi.
  private static int partition(int[] arr, int lo, int hi) {
    int pivot = hi;
    int left = lo;
    int right = hi - 1;

    while (left <= right) {
      while (left <= right && arr[left] < arr[pivot]) {
        left++;
      }
      while (left <= right && arr[right] > arr[pivot]) {
        right--;
      }
      if (left <= right) {
        swap(arr, left, right);
        left++;
        right--;
      }
    }

    swap(arr, left, pivot);
    return left;
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}

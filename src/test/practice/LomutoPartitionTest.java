package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests for Lomuto's partition. The partition property is checked on a range of
 * slices: the returned index holds the pivot, everything before it is at most the
 * pivot, and everything after it (within the slice) is greater than the pivot.
 */
public class LomutoPartitionTest {

  // Partitions arr[lo..hi] and checks the Lomuto property around the returned mark.
  private void checkProperty(int[] input, int lo, int hi) {
    int pivot = input[hi];
    int[] arr = input.clone();
    int mark = LomutoPartition.lomutoPartition(arr, lo, hi);

    assertTrue(lo <= mark && mark <= hi, "mark should stay within the slice");
    assertEquals(pivot, arr[mark], "pivot value should sit at the returned index");
    for (int i = lo; i < mark; i++) {
      assertTrue(arr[i] <= pivot, "left of mark should be <= pivot at index " + i);
    }
    for (int i = mark + 1; i <= hi; i++) {
      assertTrue(arr[i] > pivot, "right of mark should be > pivot at index " + i);
    }
  }

  @Test
  public void singleElementSlice() {
    checkProperty(new int[] {5}, 0, 0);
  }

  @Test
  public void allEqualValues() {
    checkProperty(new int[] {4, 4, 4, 4}, 0, 3);
  }

  @Test
  public void pivotIsLargest() {
    checkProperty(new int[] {2, 1, 4, 3, 5}, 0, 4);
  }

  @Test
  public void pivotIsSmallest() {
    checkProperty(new int[] {5, 4, 3, 2, 1}, 0, 4);
  }

  @Test
  public void wholeArrayUnsorted() {
    checkProperty(new int[] {3, 5, 8, 1, 2, 9, 4, 7, 6}, 0, 8);
  }

  @Test
  public void innerSliceSatisfiesTheProperty() {
    checkProperty(new int[] {9, 3, 1, 5, 2, 8}, 1, 4);
  }

  @Test
  public void innerSliceLeavesValuesOutsideItAlone() {
    int[] arr = {9, 3, 1, 5, 2, 8};
    LomutoPartition.lomutoPartition(arr, 1, 4);
    assertArrayEquals(new int[] {9, 1, 2, 5, 3, 8}, arr);
  }
}

package practice;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for quickselect. Each result is checked against a sorted-array oracle:
 * the kth largest of an array is the element at index length - k once the
 * array is sorted.
 */
public class QuickSelectTest {

  // Sorts a copy and reads off the kth largest directly, as an independent oracle.
  private int oracle(int[] numbers, int k) {
    int[] sorted = numbers.clone();
    Arrays.sort(sorted);
    return sorted[sorted.length - k];
  }

  private void check(int[] numbers, int k) {
    int expected = oracle(numbers, k);
    assertEquals(expected, QuickSelect.findKthLargest(numbers.clone(), k));
  }

  @Test
  public void secondLargest() {
    check(new int[] {3, 2, 1, 5, 6, 4}, 2);
  }

  @Test
  public void largestElement() {
    check(new int[] {3, 2, 1, 5, 6, 4}, 1);
  }

  @Test
  public void smallestElementIsKthWhenKIsLength() {
    int[] a = {3, 2, 1, 5, 6, 4};
    check(a, a.length);
  }

  @Test
  public void withDuplicates() {
    check(new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6}, 4);
  }

  @Test
  public void singleElement() {
    check(new int[] {42}, 1);
  }

  @Test
  public void allEqualValues() {
    check(new int[] {7, 7, 7, 7}, 3);
  }
}

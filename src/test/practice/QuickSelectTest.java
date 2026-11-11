package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Tests for quickselect. */
public class QuickSelectTest {

  @Test
  public void singleElement() {
    assertEquals(42, QuickSelect.findKthLargest(new int[] {42}, 1));
  }

  @Test
  public void largestElement() {
    assertEquals(6, QuickSelect.findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 1));
  }

  @Test
  public void secondLargest() {
    assertEquals(5, QuickSelect.findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2));
  }

  @Test
  public void smallestElementWhenKIsTheLength() {
    assertEquals(1, QuickSelect.findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 6));
  }

  @Test
  public void allEqualValues() {
    assertEquals(7, QuickSelect.findKthLargest(new int[] {7, 7, 7, 7}, 3));
  }

  @Test
  public void withDuplicates() {
    assertEquals(4, QuickSelect.findKthLargest(new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
  }
}

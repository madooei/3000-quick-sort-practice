package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * The scenarios for sort colors. A concrete subclass supplies sort() to pick
 * the solution under test.
 */
public abstract class SortColorsTest {

  // Calls the solution under test.
  protected abstract void sort(int[] colors);

  // Sorts a copy of input and checks it against expected.
  private void check(int[] input, int[] expected) {
    int[] colors = input.clone();
    sort(colors);
    assertArrayEquals(expected, colors);
  }

  @Test
  public void emptyArrayStaysEmpty() {
    check(new int[] {}, new int[] {});
  }

  @Test
  public void singleColor() {
    check(new int[] {1}, new int[] {1});
  }

  @Test
  public void mixedColors() {
    check(new int[] {2, 0, 2, 1, 1, 0}, new int[] {0, 0, 1, 1, 2, 2});
  }

  @Test
  public void alreadySorted() {
    check(new int[] {0, 0, 1, 1, 2, 2}, new int[] {0, 0, 1, 1, 2, 2});
  }

  @Test
  public void reverseSorted() {
    check(new int[] {2, 2, 1, 1, 0, 0}, new int[] {0, 0, 1, 1, 2, 2});
  }

  @Test
  public void allZeros() {
    check(new int[] {0, 0, 0}, new int[] {0, 0, 0});
  }

  @Test
  public void allTwos() {
    check(new int[] {2, 2, 2}, new int[] {2, 2, 2});
  }
}

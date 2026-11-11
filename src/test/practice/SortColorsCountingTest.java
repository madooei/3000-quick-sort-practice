package practice;

/** Runs the sort colors scenarios against the counting solution. */
public class SortColorsCountingTest extends SortColorsTest {

  @Override
  protected void sort(int[] colors) {
    SortColors.sortColorsCounting(colors);
  }
}

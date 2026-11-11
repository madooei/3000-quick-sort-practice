package practice;

/** Runs the sort colors scenarios against the single-pass three-way solution. */
public class SortColorsThreeWayTest extends SortColorsTest {

  @Override
  protected void sort(int[] colors) {
    SortColorsThreeWay.sortColors(colors);
  }
}

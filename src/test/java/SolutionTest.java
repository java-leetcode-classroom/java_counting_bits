import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void countBitsExample1() {
    assertArrayEquals(
        new int[]{0,1,1},
        sol.countBits(2)
    );
  }
  @Test
  void countBitsExample2() {
    assertArrayEquals(
        new int[]{0,1,1,2,1,2},
        sol.countBits(5)
    );
  }
}
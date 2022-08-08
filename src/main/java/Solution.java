public class Solution {
  public int[] countBits(int n) {
    int[] ans = new int[n+1];
    int k = 0;
    for (int pos = 1; pos <= n; pos++) {
      if (pos == (0b1 << k)) {
        ans[pos] = 1;
        k++;
      } else {
        ans[pos] = 1 + ans[pos - (0b1 << (k-1))];
      }
    }
    return ans;
  }
}

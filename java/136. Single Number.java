class Solution {
  public static int singleNumber(int[] nums) {
    int xor = 0;
    for (int i = 0; i < nums.length; i++)
      // xor operation gives the result 0 for two similar numbers Ex - 5 ^ 5 = 0, 0 ^
      // 5 = 5
      xor = xor ^ nums[i];
    return xor;
  }

  public static void main(String[] args) {
    int[] nums = { 4, 1, 2, 1, 2 };
    System.out.println(singleNumber(nums));
  }
}

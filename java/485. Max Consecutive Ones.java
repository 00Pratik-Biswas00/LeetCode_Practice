class Solution {

  public static int findMaxConsecutiveOnes(int[] nums) {
    int maxCount = 0;
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        count++;
      } else {
        maxCount = Math.max(maxCount, count);
        count = 0;
      }
    }
    // to check if the last seq in larger
    maxCount = Math.max(maxCount, count);

    return maxCount;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 1, 1, 0, 1, 1 };
    System.out.println(findMaxConsecutiveOnes(nums));
  }
}

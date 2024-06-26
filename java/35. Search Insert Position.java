class SearchInsertPosition {
  public static int searchInsert(int[] nums, int target) {
    int low = 0, high = nums.length - 1;
    int ans = nums.length;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (nums[mid] >= target) {
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int nums[] = { 1, 3, 4, 5, 6 };
    System.out.println(searchInsert(nums, 7));
  }
}

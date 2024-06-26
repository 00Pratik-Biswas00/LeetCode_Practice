class ContainerMaxWater {
  public static int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int maxArea = 0;

    while (left < right) {
      int currentHeight = Math.min(height[left], height[right]);
      int currentWidth = right - left;
      int currentArea = currentHeight * currentWidth;

      if (currentArea > maxArea) {
        maxArea = currentArea;
      }

      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }

    return maxArea;
  }

  public static void main(String[] args) {
    int n[] = { 1, 1 };
    System.out.println(maxArea(n));
  }
}

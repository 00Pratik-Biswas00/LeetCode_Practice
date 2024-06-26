class SetMatrixZeros {
  public static void setZeroes(int[][] matrix) {
    // m x n matrix
    int m = matrix.length, n = matrix[0].length;
    int col0 = 1;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] == 0) {
          // mark the ith row
          matrix[i][0] = 0;
          // mark the jth row
          if (j != 0)
            matrix[0][j] = 0;
          else
            col0 = 0;
        }
      }
    }

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (matrix[i][j] != 0) {
          // check for col and row
          if (matrix[0][j] == 0 || matrix[i][0] == 0) {
            matrix[i][j] = 0;
          }
        }
      }
    }
    if (matrix[0][0] == 0) {
      for (int j = 0; j < n; j++) {
        matrix[0][j] = 0;
      }
    }

    if (col0 == 0) {
      for (int i = 0; i < m; i++) {
        matrix[i][0] = 0;
      }
    }
    // print
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(matrix[i][j]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
    setZeroes(matrix);
  }
}

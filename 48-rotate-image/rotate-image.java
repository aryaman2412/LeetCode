class Solution {
    // Helper function to swap elements
    private void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
        int temp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = temp;
    }

    // Reverse each row
    private void reverseRows(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                swap(matrix, i, left, i, right);
                left++;
                right--;
            }
        }
    }

    // Rotate 90 degrees clockwise
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(matrix, i, j, j, i);
            }
        }

        // Reverse each row
        reverseRows(matrix);
    }
}

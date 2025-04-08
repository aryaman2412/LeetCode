class Solution {
    public void reverse(int[] a, int low, int high) {
        int l = low, h = high - 1;
        while (l < h) {
            int temp = a[l];
            a[l] = a[h];
            a[h] = temp;
            l++;
            h--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) return;

        k = k % n;
        if (k == 0) return;

        reverse(nums, 0, n);
        reverse(nums, 0, k);
        reverse(nums, k, n);
    }
}

class Solution {
    public void reverse(int []a,int low,int high){
        int l=low;
        int h=high-1;

        while(l<h){
            int temp=a[l];
                a[l]=a[h];
                a[h]=temp;
                l++;
                h--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        if(nums.length>1){
        reverse(nums,0,nums.length);
        reverse(nums,0,k);
        reverse(nums,k,nums.length);
        }
    }
}
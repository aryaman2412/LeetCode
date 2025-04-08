class Solution {
    public void moveZeroes(int[] nums) {
        int non_zero_index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[non_zero_index]=nums[i];
                non_zero_index++;
            }
        }
        for(int i=non_zero_index;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
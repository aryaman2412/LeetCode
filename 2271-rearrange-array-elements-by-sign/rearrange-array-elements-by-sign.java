class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posIndex=0;
        int negIndex=1;
        int [] result=new int[nums.length];

        for(int num:nums){
            if(num>0){
                result[posIndex] = num;
                posIndex+=2;
            }else{
                result[negIndex] =num;
                negIndex+=2;
            }
        }

        return result;
    }
}
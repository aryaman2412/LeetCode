class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){    
            if(nums[i]>0)positive.add(nums[i]);
            else negative.add(nums[i]);
        }

        for(int i=0;i<positive.size();i++){
            ans.add(positive.get(i));
            ans.add(negative.get(i));
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;

    }
}
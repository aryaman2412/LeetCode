
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            // If num already seen, add its current frequency to count
            if (freq.containsKey(num)) {
                count += freq.get(num);
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }

        return count;
    }
}

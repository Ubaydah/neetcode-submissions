class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set_nums = new HashSet<>();
        for (int num : nums) {
            if (set_nums.contains(num)) {
                return true; 
            }
            set_nums.add(num);
        }

        return false; 
            
        }
}
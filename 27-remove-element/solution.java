class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int p2 = nums.length - 1;

        while (i <= p2) {
            if (nums[i] == val) {
                nums[i] = nums[p2]; 
                p2--; 
            } else {
                i++; 
            }
        }

        return i; 
    }
}
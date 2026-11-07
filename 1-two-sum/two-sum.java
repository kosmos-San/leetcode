import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (h.containsKey(complement)) {
                return new int[]{h.get(complement), i};
            }

            h.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
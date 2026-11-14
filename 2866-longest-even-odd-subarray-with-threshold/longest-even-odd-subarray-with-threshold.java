
class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int left = 0;
        int result = 0;

        for (int right = 0; right < nums.length; right++) {

            // Element exceeds threshold
            if (nums[right] > threshold) {
                left = right + 1;
                continue;
            }

            // First element must be even
            if (right == left && nums[right] % 2 != 0) {
                left = right + 1;
                continue;
            }

            // Same parity as previous element
            if (right > left &&
                nums[right] % 2 == nums[right - 1] % 2) {

                if (nums[right] % 2 == 0) {
                    left = right;
                } else {
                    left = right + 1;
                    continue;
                }
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}

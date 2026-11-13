class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1){
            return nums[0];
        }
        int left=0;
        int right=0;
        double maxAvg=Integer.MIN_VALUE;
        double sum=0;
        while(right!=nums.length){
        
            if(right-left!=k){
                sum+=nums[right++];
            }

            if(right-left==k){
                double avg=sum/k;
                if(avg>maxAvg){
                    maxAvg=avg;
                }
                sum-=nums[left];
                
                left++;
            }

        }
        return maxAvg;
    }
}
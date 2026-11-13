class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left=0,right=0;
        double sum=0,avg=Integer.MIN_VALUE;
        int result=0;
        while(right<arr.length){
            if(right-left!=k){
                sum+=arr[right++];
            }


            if(right-left==k){
                avg=sum/k;
                if(avg>=threshold){
                    result++;
                }
                sum-=arr[left++];
            }
        }

        return result;
    }
}
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left=0,right=0;
        double sum=0;
        int result=0;
        while(right<arr.length){
            if(right-left!=k){
                sum+=arr[right++];
            }


            if(right-left==k){
                if(sum>=threshold*k){
                    result++;
                }
                sum-=arr[left++];
            }
        }

        return result;
    }
}
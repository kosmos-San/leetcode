class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>set=new HashSet<>();
        int new_num=n;
        while(new_num!=1){
            int sum=0;
            while(new_num>0){
                int digit=new_num%10;
                new_num=new_num/10;
                sum+=digit*digit;
            }
            if(set.contains(sum)){
                return false;
            }
            set.add(sum);
            new_num=sum;
            
        }

        return true;
    }
}
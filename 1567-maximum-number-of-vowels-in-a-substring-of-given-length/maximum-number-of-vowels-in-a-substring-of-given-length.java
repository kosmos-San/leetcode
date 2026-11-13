class Solution {
    public int maxVowels(String s, int k) {
        int left=0,right=0;
        int result=0;
        int vow=0;
        Set<Character>h=new HashSet<>();
        Collections.addAll(h,'a','e','i','o','u');


        while(right<s.length()){
            if(right-left!=k){
                if(h.contains(s.charAt(right))){
                    vow++;
                }
                right++;
            }


            if(right-left==k){
                if(vow>result){
                    result=vow;
                }
                if(h.contains(s.charAt(left))){
                    vow--;
                }
                left++;
            }
        }

        return result;
    }
}
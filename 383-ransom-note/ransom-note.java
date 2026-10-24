class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        HashMap<Character,Integer>h=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char a=magazine.charAt(i);
            if(h.containsKey(a)){
                h.put(a,h.get(a)+1);
            }else{
                h.put(a,1);
            }
        }

        for(int i=0;i<ransomNote.length();i++){
            char a=ransomNote.charAt(i);
            if(!h.containsKey(a)){
                return false;
            }

            if(h.get(a)==1){
                h.remove(a);
            }else{
                h.put(a,h.get(a)-1);
            }
        }

        return true; 
    }
}
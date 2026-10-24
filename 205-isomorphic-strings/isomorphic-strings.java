class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character>h=new HashMap<>();
        int i=0;
        while(i<s.length()){
            char a=s.charAt(i);
            char b=t.charAt(i);

            if(h.containsKey(a)){
                if(!(h.get(a)==b)){
                    return false;
                }  
            }
            if(h.containsValue(b)){
                if(h.get(a)==null||!(h.get(a)==b)){
                    return false;
                }
            }

            i++;
            h.put(a,b);
            
        }
        return true;
    }
}
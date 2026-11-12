
class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        // Main logic
        int left = 0;
        int right = p.length();

        while (right <= s.length()) {

            String check = s.substring(left, right);

            boolean isAnagram = checkAnagram(check, p);

            if (isAnagram) {
                result.add(left);
            }

            left++;
            right++;
        }

        return result;
    }

    public boolean checkAnagram(String s, String p) {

        int[] freq = new int[26];

        // Build frequency array using p
        for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i) - 'a']++;
        }

        // Check characters using s
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']--;
        }

        // Check whether all frequencies are zero
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}

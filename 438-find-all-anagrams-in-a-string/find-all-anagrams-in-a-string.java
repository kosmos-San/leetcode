
class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] freq = new int[26];

        // Store frequency of characters in p
        for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i) - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add incoming character
            freq[s.charAt(right) - 'a']--;

            // Maintain fixed window size
            if (right - left + 1 > p.length()) {
                freq[s.charAt(left) - 'a']++;
                left++;
            }

            // Check if current window is an anagram
            if (right - left + 1 == p.length()) {

                boolean isAnagram = true;

                for (int i = 0; i < 26; i++) {
                    if (freq[i] != 0) {
                        isAnagram = false;
                        break;
                    }
                }

                if (isAnagram) {
                    result.add(left);
                }
            }
        }

        return result;
    }
}

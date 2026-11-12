
class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] freq = new int[26];

        // Build frequency array for p
        for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = 0;

        while (right < s.length()) {

            // Add incoming character
            freq[s.charAt(right) - 'a']--;

            // Maintain fixed window size
            if (right - left + 1 > p.length()) {
                freq[s.charAt(left) - 'a']++;
                left++;
            }

            // Check anagram when window size is correct
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

            // Move right pointer
            right++;
        }

        return result;
    }
}

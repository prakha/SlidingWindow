package WithoutWindowSize;

import java.util.HashMap;

public class longestKsubstr {

    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        int ans = longestKSubstring(s, k);
        System.out.println(ans);
    }
    static int longestKSubstring(String s, int k){
        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0;
        int j = 0;
        int maxStr = -1;
        int currLength = 0;
        while(j < s.length()){
            char ch = s.charAt(j);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch) + 1);
            }
            else {
                hm.put(ch, 1);
            }
            if(hm.size() < k){
                j++;
            }
            else if(hm.size() == k){
                currLength = Math.max(currLength, j-i+1);
                j++;
            }
            else{
                while (hm.size() > k){
                    if(hm.containsKey(s.charAt(i)) && i < s.length()){
                        hm.put(s.charAt(i), hm.get(s.charAt(i))-1);
                    }
                    if(hm.get(s.charAt(i)) == 0){
                        hm.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return maxStr;
    }
}



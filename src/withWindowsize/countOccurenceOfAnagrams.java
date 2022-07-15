
package withWindowsize;
import java.util.*;


public class countOccurenceOfAnagrams {
    static List<Integer> findAnagrams(String s, String p){
        List<Integer> ans = new ArrayList<>();
        HashMap<Character,Integer> m = new HashMap<>();
        //put Elements of pattern in map
        for(int i=0;i<p.length();i++){
            if(m.containsKey(p.charAt(i)))
                m.put(p.charAt(i),m.get(p.charAt(i))+1);
            else
                m.put(p.charAt(i),1);
        }
        int count = m.size();
        int i = 0;
        int j = 0;
        while(j < s.length()){
            // calculations
            if(m.containsKey(s.charAt(j))){
                m.put(s.charAt(j),m.get(s.charAt(j))-1);
                if(m.get(s.charAt(j))==0){
                    count--;
                }
            }
            //window size less than k
            if(j-i+1<p.length())
                j++;

            else if(j-i+1==p.length()){
                //ans calculate
                if(count==0){
                    ans.add(i);
                }
                if(m.containsKey(s.charAt(i))){
                    m.put(s.charAt(i),m.get(s.charAt(i))+1);
                    if(m.get(s.charAt(i))==1)
                        count++;
                }
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String txt = "forxxorfxdofr";
        String pat = "for";
        List<Integer> ans = findAnagrams(txt, pat);
        System.out.println(ans);

    }
}

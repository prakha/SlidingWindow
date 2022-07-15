package roughWork;
import java.util.*;

public class main1 {
    public static void main(String[] args) {
        String[] words = {"rwjje","aittjje","auyyn","lqtktn","lmjwn"};
        String[] arr = uniqueMorseRepresentations(words);
        for(String word: arr){

            System.out.println(word);
        }
    }

    static String[] uniqueMorseRepresentations(String[] words) {
        int k = 0;
        int count = 0;
        String[] sb = new String[words.length];
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<Character, String> mp = new HashMap<>();
        int i = 0;
        for(int a = 97; a <= 122; a++){
            mp.put((char)a, morse[i]);
            i++;
        }
        for(String word: words){
            String s1 = "";
            for(i=0;i < word.length(); i++){
                char temp = word.charAt(i);
                s1 += mp.get(temp);
                if(i == word.length()-1){
                    sb[k++] = s1;
                }
            }
        }

        return sb;
    }
}

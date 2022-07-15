package roughWork;

import javax.imageio.spi.ServiceRegistry;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        char[] ch = new char[indices.length];
        for(int i = 0; i < s.length(); i++) {
            ch[indices[i]] = s.charAt(i);
        }

        String s1 = new String(ch);
        System.out.println(s1);


    }

    static String restoreString(String s, int[] indices) {
        int i = 0;
        char[] ch = s.toCharArray();
        while(i < ch.length){
            int correct = indices[i] - 1;
            if(indices[i] != indices[correct]){
                swap(ch, i, correct);
            }
            else{
                i++;
            }

        }

        String s1 = new String(ch);
        return s1;

    }

    static void swap(char[] s,int i,int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}

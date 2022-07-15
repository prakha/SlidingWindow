package roughWork;

public class count {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int m = arr.length;
        System.out.println(count(arr, m, 4));
    }

    static int count(int[] S, int m, int n){
        // If n is 0 then there is 1 solutions
        //(do not include any coin)
        if(n == 0){
            return 1;
        }
        //IF n is less than 0 then no
        //solutions exists
        if(n < 0){
            return 0;
        }
        if(m <= 0 && n >= 1){
            return 0;
        }
        // count is sum of solutions (i)
        // including S[m-1] (ii) excluding S[m-1]
        return count(S, m - 1, n) + count(S, m, n - S[m - 1]);
    }

}

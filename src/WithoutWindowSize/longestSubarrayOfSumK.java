package WithoutWindowSize;

public class longestSubarrayOfSumK {

    static int longestSumSubarray(int[] arr, int condition){
        int i = 0;
        int j = 0;
        int n = arr.length;
        int sum = 0;
        int currLen = 0;
        while(j < n){
            sum += arr[j];
            if(sum < condition){
                j++;
            }
            if(sum < 0 && sum < condition){
                i++;
                j++;
            }
            else if(sum == condition){
                currLen = Math.max(currLen, j-i+1);
                j++;

            }
            else {
                while (sum > condition){
                    sum = sum - arr[i];
                    i++;
                    if(sum == condition){
                        currLen = Math.max(currLen, j-i+1);
                    }
                }
                j++;
            }
        }
        return currLen;
    }
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4 , -1, -2, 1, 5, -3};
        int condition = 7;
        int maxLength = longestSumSubarray(arr, condition);
        System.out.println(maxLength);
    }
}

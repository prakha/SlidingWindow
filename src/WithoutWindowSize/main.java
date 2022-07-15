package WithoutWindowSize;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] nums, int k) {
        for(int l = 0; l < k; l++){
            rotateByOne(nums);
        }
    }
    static void rotateByOne(int[] arr){
        for(int i = arr.length-1; i > 0; i--){
            for(int j = i-1; j >= 0 && j < i; j++){
                swap(arr, i, j);
            }
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

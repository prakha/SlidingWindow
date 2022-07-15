package WithoutWindowSize;

public class subArraySumEqualsK {

    public static void main(String[] args) {
        int k = 0;
        int[] nums = {-1, -1, 1};
        int ans = subarraySum(nums , k);
        System.out.println(ans);

    }


    static int subarraySum(int[] nums, int k){
        int i = 0;
        int j = 0;
        int count = 0;
        int sum = 0;
        int n = nums.length;
        if(k == 0 && containsPositive(nums) && nums.length > 0){
            count = 0;
            return count;
        }

        while(j < n){
            sum += nums[j];
            if(sum < k){
                j++;
            }
             if (sum < k & sum < 0){
                i++;
                j++;
            }

            else if(sum == k){
                count++;
                j++;
            }
            else if(sum > k){
                while(sum > k){
                    sum = sum - nums[i];
                    i++;
                    if(sum == k ){
                        count++;
                    }
                }
                j++;
            }

        }
        return count;

    }

    static boolean containsPositive(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                return false;
            }

        }
        return true;
    }
}

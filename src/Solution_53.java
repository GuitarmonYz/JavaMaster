/**
 * Created by zhaoyan on 8/1/17.
 */
public class Solution_53 {
    public int MaxSubArray(int[] nums){
        if (nums.length == 0|| nums == null)
            return Integer.MAX_VALUE;
        int cur_sum = nums[0];
        int max_sum = nums[0];
        for (int i = 1; i < nums.length; i++){
            cur_sum = Math.max(nums[i], nums[i]+cur_sum);
            max_sum = Math.max(cur_sum, max_sum);
        }
        return max_sum;
    }
}

/**
 * Created by zhaoyan on 8/1/17.
 */
public class Solution_75 {
    public void sortColors(int[] nums){
        if (nums.length < 1||nums == null) throw new NullPointerException("null pointer");
        int left = 0;
        int right = nums.length - 1;
        int cur = 0;
        while (cur <= right){
            if (nums[cur] == 2){
                swap(nums, cur, right);
                right--;
            }
            if (nums[cur] == 0){
                swap(nums, cur, left);
                left++;
            }
            if (nums[cur] != 2){
                cur++;
            }
        }
    }
    private void swap(int[] nums, int a, int b){
        if(nums[a] != nums[b]){
            nums[a] ^= nums[b];
            nums[b] ^= nums[a];
            nums[a] ^= nums[b];
        }
    }
}

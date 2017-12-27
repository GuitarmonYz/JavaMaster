/**
 * Created by zhaoyan on 8/21/17.
 */
public class Solution_215 {
    public int findKthLargest(int[] nums, int k) {
        int pos = 0;
        int start = 0;
        int end = nums.length - 1;
        while(pos != k){
            pos = setPivot(nums, start, end);
            if (pos < k){
                start = pos+1;
            }else{
                end = pos-1;
            }
        }
        return nums[pos];
    }
    private int setPivot(int[] nums, int start, int end){
        int pos = start;
        int pivot = nums[end];
        for (int i = start; i < end; i++){
            if(nums[i] <= nums[pivot]){
                if (nums[pos]>pivot){
                    swap(nums, pos, i);
                }
                pos++;
            }
        }
        return pos;
    }
    private void swap(int[] nums, int i, int j){
        if (nums[i] == nums[j]) return;
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }
}

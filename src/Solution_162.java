public class Solution_162 {
    public int FindPeakElement(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid1 = (start + end)/ 2;
            int mid2 = mid1 + 1;
            if (nums[mid1] < nums[mid2])
                start = mid2;
            else
                end = mid1;
        }
        return start;
    }
}

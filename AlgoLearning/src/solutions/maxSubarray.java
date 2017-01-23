package solutions;

public class maxSubarray {
	public int maxsub(int[] nums){
		if(nums == null||nums.length == 0){
			return -1;
		}
		int cursum = 0;
		int maxsum = 0;
		for(int i=0;i<nums.length;i++){
			cursum = Math.max(nums[i], nums[i]+cursum);
			maxsum = Math.max(maxsum, cursum);
		}
		return maxsum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maxSubarray ms = new maxSubarray();
		int[] nums = {-1,2,3,-2,1,4,5};
		System.out.println("max sum: "+ms.maxsub(nums));
	}

}

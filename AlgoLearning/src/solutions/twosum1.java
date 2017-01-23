package solutions;

import java.util.Arrays;

public class twosum1 {
	public boolean twoSum(int[] array, int target){
		Arrays.sort(array);
		int start = 0;
		int end = array.length-1;
		while(start<end){
			if(array[start]+array[end]==target)
				return true;
			else if(array[start]+array[end]<target)
				start++;
			else if(array[start]+array[end]>target)
				end--;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twosum1 ts = new twosum1();
		int[] array = {1,2,4,10,6};
		System.out.println(ts.twoSum(array, 9));
		
	}

}

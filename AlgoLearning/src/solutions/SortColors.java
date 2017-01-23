package solutions;

public class SortColors {
	public static int[] input = {1,2,0,1,2};
	public static void main(String[] args){
		SortColors sc = new SortColors();
		
		sc.sort(input);
		
	}
	
	
	public void sort(int[] input){
		//input = this.input;
		
		int cur=0;
		int left=input.length-1;
		int right=0;
		while(cur<=right){
			if(input[cur]==0){
				swap(input,cur,left);
				left++;cur++;
			}else if(input[cur]==2){
				swap(input,cur,right);
				right--;
			}else{
				cur++;
			}
		}
		//System.out.println("what happend");
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}
		
	}
	public void swap(int[] array, int a, int b){
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
		
	}
}

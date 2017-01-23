package solutions;

public class FindBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isBadVersion(int m){
		return true;
	}
	public int find(int n){
		if(n<=0){
			return -1;
		}
		
		int start = 1;
		int end = n;
		while(start<end-1){
			int mid = start + (end-start)/2;
			if(!isBadVersion(mid)){
				start = mid;
			}else{
				end = mid;
			}
		}
		return isBadVersion(start)?start:end;
	}
}

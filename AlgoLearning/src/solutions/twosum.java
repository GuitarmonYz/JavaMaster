package solutions;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class twosum {
	private final Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	private final List<Integer> list = new ArrayList<Integer>();
	public void add(int num){
		list.add(num);
		Integer frequency = map.get(num);
		if(frequency == null ){
			map.put(num, 1);
		}else{
			map.put(num, frequency+1);
		}
	}
	public boolean find(int val){
		for(int curkey:list){
			int target = val - curkey;
			Integer count = map.get(target);
			if(count!=null){
				if(curkey!=target||(curkey==target&&count>=2)){
					return true;
				}
			}
			
		}
		return false;
	}
	
}

package solutions;
import java.util.HashMap;
import java.util.Map;

import util.RandomNode;
public class CodyLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public RandomNode copy(RandomNode head){
		if(head == null){
			return null;
		}
		Map<RandomNode,RandomNode> map = new HashMap<RandomNode,RandomNode>();
		RandomNode cur = head;
		while (cur!=null){
			if(!map.containsKey(cur)){
				RandomNode curcopy = new RandomNode(cur.val);
				map.put(cur, curcopy);
			}
			if(cur.next!=null&&!map.containsKey(cur.next)){
				RandomNode nextcopy = new RandomNode(cur.next.val);
				map.put(cur.next, nextcopy);
			}
			if(cur.random!=null&&!map.containsKey(cur.random)){
				RandomNode randomcopy = new RandomNode(cur.random.val);
				map.put(cur.random, randomcopy);
			}
			if(cur.next != null){
				map.get(cur).next = map.get(cur.next);
			}
			if(cur.random != null){
				map.get(cur).random = map.get(cur.random);
			}
			
			cur = cur.next;
		}
		return map.get(head);
	}
}

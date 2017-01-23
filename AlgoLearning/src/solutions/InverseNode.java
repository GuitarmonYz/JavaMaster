package solutions;

import util.Node;
public class InverseNode {
	public int[]  array = {1,2,3,4,5};
	//ArrayList<Node> nodelist = new ArrayList<Node>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InverseNode inv = new InverseNode();
		int[]  array = {1,2,3,4,5};
		Node head = buildList(array);
		System.out.println("Original: ");
		inv.display(head);
		Node newhead = inv.recurReverse(head);
		System.out.println("recurtion inverse: ");
		inv.display(newhead);
		newhead = inv.iterReverse(newhead);
		System.out.println("interation inverse: ");
		inv.display(newhead);
		
	}
	
	public static Node buildList(int[] array){
		Node head = null;
		Node pre = null;
		for(int i=0;i<array.length;i++){
			Node tmp = new Node(array[i]);
			if(head == null){
				head = tmp;
			}else{
				pre.next = tmp;
				
			}
			pre = tmp;
		}
		return head;
		
	}
	
	public Node iterReverse(Node head){
		Node pre = null;
		Node current = head;
		Node next = null;
		while (current != null){
			next = current.next;
			current.next = pre;
			pre = current;
			current = next;
		}
		return pre;
	}
	public Node recurReverse(Node head){
		if(head.next == null||head == null){
			return head;
		}
		Node newhead = recurReverse(head.next);
		head.next.next = head;
		head.next = null;
		return newhead;
	}
	public void display(Node head){
		//Node next = head.next;
		while(head!=null){
			System.out.println(head.value);
			head = head.next;
		}
	}

}

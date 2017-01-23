package solutions;
import util.Node;
public class PartitionLinklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Node partition(Node head, int x){
		Node smallpre = new Node(0);
		Node largepre = new Node(0);
		Node largedummy = largepre;
		Node smalldummy = smallpre;
		while(head!=null){
			if(head.value<x){
				smallpre.next = head;
				smallpre = smallpre.next;
			}else{
				largepre.next = head;
				largepre = largepre.next;
			}
			head = head.next;
		}
		smallpre.next = largedummy.next;
		largepre.next = null;
		return smalldummy.next;
	}
}

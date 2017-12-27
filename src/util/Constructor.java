package util;

/**
 * Created by zhaoyan on 8/1/17.
 */
public class Constructor {
    public static ListNode listConstructor(int[] array){
        ListNode dummy = new ListNode(-1);
        ListNode head = new ListNode(array[0]);
        dummy.next = head;
        for (int i = 1; i < array.length; i++){
            head.next = new ListNode(array[i]);
            head = head.next;
        }
        head.next = null;
        return dummy.next;
    }
}

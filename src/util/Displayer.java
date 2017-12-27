package util;

/**
 * Created by zhaoyan on 8/1/17.
 */
public class Displayer {

    public static void ListDisplay(ListNode head){
        while (head != null){
            System.out.print(head.val);
            head = head.next;
        }
        System.out.println();
    }

    public static void TreeDisplay(TreeNode root){
        
    }

    public static void ArrayDisplay(int[] array){
        for(int val:array){
            System.out.print(val);
        }
        System.out.println();
    }
}

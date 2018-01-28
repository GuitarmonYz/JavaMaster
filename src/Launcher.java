/**
 * Created by zhaoyan on 7/31/17.
 */
import util.Constructor;
import util.Displayer;
import util.ListNode;
import util.Solution;
public class Launcher {

    public static void main(String args[]){
        Launcher lan = new Launcher();
        lan.runSolution();
    }
    public void runSolution(){
        Solution_78 sl = new Solution_78();
        int[] nums = {1,2,3};
        sl.subsets(nums);
        //System.out.println(sl.getMin());


//        sl.sortColors(array);
//        Displayer.ArrayDisplay(array);

//        ListNode head = Constructor.listConstructor(array);
//        ListNode new_head = sl.findMid(head);
//        Displayer.ListDisplay(head);
//        Displayer.ListDisplay(new_head);
    }
}

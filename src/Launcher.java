/**
 * Created by zhaoyan on 7/31/17.
 */
import util.Constructor;
import util.Displayer;
import util.ListNode;
import util.Solution;
public class Launcher {
    int[] array = {1};

    public static void main(String args[]){
        Launcher lan = new Launcher();
        lan.runSolution();
    }
    public void runSolution(){
        Solution_155 sl = new Solution_155();
        sl.push(-2);
        sl.push(0);
        sl.push(3);
        sl.pop();
        sl.pop();
        sl.pop();
        //System.out.println(sl.getMin());


//        sl.sortColors(array);
//        Displayer.ArrayDisplay(array);

//        ListNode head = Constructor.listConstructor(array);
//        ListNode new_head = sl.findMid(head);
//        Displayer.ListDisplay(head);
//        Displayer.ListDisplay(new_head);
    }
}

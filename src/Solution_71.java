import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by zhaoyan on 8/3/17.
 */
public class Solution_71 {
    public String simplifyPath(String path) {
        if (path == null||path.length() == 0)
            return new String();
        path = path.trim();
        Deque<String> deque = new LinkedList<String>();
        for(String str:path.split("/")){
            if (str.equals("..")){
                deque.pollLast();
            }else if (!str.equals(".")){
                deque.offerLast(str);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()){
            sb.append("/");
            sb.append(deque.pollFirst());
        }
        return sb.length() == 0 ? new String("/") : sb.toString();
    }
}

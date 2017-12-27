import java.util.Stack;

public class Solution_388 {
    public int lengthLongestPath(String input) {
        String[] levelArray = input.split("\n");
        Stack<String> currentPath = new Stack<>();
        int golebalMaxLen = 0;
        int preLen = 0;
        for (String levelString : levelArray) {
            String[] levelStringArray = levelString.split("\t");
            int numOfTab = levelStringArray.length - 1;
            while (currentPath.size()-1 > numOfTab) {
                currentPath.pop();
            }
            currentPath.push(levelStringArray[levelStringArray.length-1]);
            int curLen = preLen + levelStringArray[levelStringArray.length-1].length();
        }
        return 0;
    }
}

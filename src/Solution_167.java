/**
 * Created by zhaoyan on 8/1/17.
 */
public class Solution_167 {
    public int[] twoSum(int[] numbers, int target){
        int head = 0;
        int tail = numbers.length - 1;
        int[] res = new int[2];
        while (head <= tail){
            if (numbers[head] + numbers[tail] == target) {
                res[0] = head + 1;
                res[1] = tail + 1;
                return res;
            }else if (numbers[head] + numbers[tail] > target){
                tail--;
            }else{
                head++;
            }
        }
        return res;
    }
}

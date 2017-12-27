import java.util.HashMap;
import java.util.Map;
/**
 * Created by zhaoyan on 8/1/17.
 */
public class Solution_1 {
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                res[0] = map.get(nums[i]);
                res[1] = i;
                return res;
            }
            map.put(target - nums[i], i);
        }
        return res;
    }
}

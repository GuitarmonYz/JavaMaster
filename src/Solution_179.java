import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by zhaoyan on 8/15/17.
 */
public class Solution_179 {
    public String largestNumber(int[] num){
        String[] s_num = new String[num.length];
        for (int i = 0; i < num.length; i++){
            s_num[i] = String.valueOf(num[i]);
        }
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s2.compareTo(s1);
            }
        };
        Arrays.sort(s_num, comp);
        if (s_num[0].charAt(0) == '0') return "0";
        StringBuilder sb = new StringBuilder();
        for(String s: s_num)
            sb.append(s);
        return sb.toString();
    }
}

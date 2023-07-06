package Task;

import java.util.ArrayList;
import java.util.List;

public class SummaryRangernumber {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<Integer> s = new ArrayList<>();
        SingleNumber sm = new SingleNumber();
        for(int i = 0 ; i < nums.length ; i++){
            for (int j = i + 1 ; j < nums.length-1;j++){
                if((nums[j] - nums[i])==1) {
                    s.add(nums[i]);
                }
                i++;
            }
        }
        for (int i: s) {
            s
        }
        return s;
    }
}

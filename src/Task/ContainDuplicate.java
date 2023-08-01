package Task;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ContainDuplicate {
    public boolean cotainsDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length -1 ; i++){
            if (nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
}

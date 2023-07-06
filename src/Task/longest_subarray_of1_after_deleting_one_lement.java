package Task;

import java.util.ArrayList;

public class longest_subarray_of1_after_deleting_one_lement {
    public int longestSubarray(int[] nums) {
        int count = 0;
        int maxcount = 0;
        int starts= 0;
        for(int i = 0 ; i < nums.length ; i++){
            count += nums[i] == 0 ? 1 : 0;
            while (count > 1){
                count -= nums[starts] == 0 ? 1 : 0;
                starts++;
            }
            maxcount = Math.max(maxcount , i - starts);
        }
            return  maxcount;
    }
}

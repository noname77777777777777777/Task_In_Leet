package Task;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumberII {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> s = new ArrayList<>();
        for(int i = 0 ; i < nums.length; i++){
            for(int j = nums.length -1 ; j>=0;j--){
                if (nums[i] == nums[j] && i!=j){
                    s.add(i);
                }
            }
        }
        for (int i:s) {
            nums[i] = 0;
        }
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != 0){
                return nums[i];
            }
        }
        return nums[0];
    }
}

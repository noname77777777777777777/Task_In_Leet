package Task;

public class ContainduplicateII {
    public boolean containsNearbyduplicate(int[] nums,int k){
        for(int i = 0 ; i < nums.length - 1 ; i++){
            for (int j = i + 1 ; j < nums.length ; j++){
                if(nums[i] == nums[j] && Math.abs(i - j)<=k){
                    return false;
                }
            }
        }
        return false;
    }
}

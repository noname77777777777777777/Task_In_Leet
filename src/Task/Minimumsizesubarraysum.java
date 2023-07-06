package Task;

public class Minimumsizesubarraysum {
    public int minSubArrayLen(int target, int[] nums) {
        int rigth = 0;
        int sum = 0;
        int minlenarray = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            sum+=nums[i];
            while (sum >= target){
                minlenarray = Math.min(minlenarray,i - rigth +1);
                sum-=nums[rigth];
                rigth++;
            }
        }
        if(rigth == 0){
            return 0;
        }
        return minlenarray;
    }
}

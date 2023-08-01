package Task;

import List.ListNode;

import java.util.Arrays;

public class movesZero {
    public void sorted_arr(int[] nums){
        for (int i = 0; i < nums.length ; i++){
            for (int j = i + 1 ; j < nums.length - 1 ; i++){
                if(i < j){
                    swap(i,j);
                }
            }
        }
    }

    private void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0 ; i < nums.length ; i++) {
             if(nums[i] != 0){
                 nums[index] = nums[i];
                 index++;
             }
             while (index < nums.length){
                 nums[index] = 0;
                 index++;
             }
        }
        for (int i : nums){
            System.out.println(nums[i]);
        }
    }
}

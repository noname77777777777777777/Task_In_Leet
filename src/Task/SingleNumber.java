package Task;

public class SingleNumber {
        public void swap(int[] arr,int j,int i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
//        public void delete_element(int[] nums , int index){
//            if(index < 0 || index >= nums.length){
//                System.out.println("Index out of bound");
//                return;
//            }
//            for(int i = index ; i < nums.length -1; i++){
//                nums[i] = nums[i+1];
//            }
//
//        }
        public void mark_element(int[] nums , int index){
            //swap(nums,index,nums.length-1);
            nums[nums.length-1] = 0;
        }
        public int singleNumber(int[] nums) {
            for(int i = 0 ; i < nums.length; i++){
                for(int j = nums.length -1 ; j>=0;j--){
                    if (nums[i] == nums[j] && i!=j){
                        System.out.println(nums[i]);
//                        mark_element(nums,i);
//                        mark_element(nums,j);
                    }
                }
            }
            for(int i = 0 ; i < nums.length - 1 ; i++){
                if(nums[i] != 0){
                    return nums[i];
                }
            }
            return nums[0];
        }
}

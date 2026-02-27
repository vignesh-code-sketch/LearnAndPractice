import java.util.Arrays;

public class InsertionsSort {

    public int[] insertionSort(int[] nums){

        for(int i = 0; i < nums.length; i++){
            if(nums[i]>nums[i+1]){
                int key = nums[i+1];
                nums[i+1] = nums[i];
                nums[i] = key;
                for(int j =i; j>0; j--){
                    if(nums[j-1]<nums[i+1]){
                        int temp = nums[j];
                        nums[j] = nums[i+1];
                        nums[i+1] = temp;
                    }
                }
            }
        System.out.println(Arrays.toString(nums));
        }
        return nums;
    }


    
}

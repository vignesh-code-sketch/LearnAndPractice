import java.util.Arrays;

public class InsertionsSort {

    public int[] insertionSort(int[] nums){

        System.out.println("new");

        for(int i = 0; i < nums.length-1; i++){
            int key = nums[i+1];
                int j = i;
                while( j >=0 && nums[j]>key){
                nums[j + 1] = nums[j]; 
                j--;
                // System.out.println(" ");
                System.out.println(Arrays.toString(nums));

            }
            nums[j+1] = key;
                System.out.println(Arrays.toString(nums));
            
        }
        return nums;
    }


    
}

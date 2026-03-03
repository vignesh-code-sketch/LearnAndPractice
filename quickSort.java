import java.lang.reflect.Array;
import java.util.Arrays;

public class quickSort {
    public int[] quickSort(int[] nums, int low, int high){
        if(low<high){
        int pi = getPivot(nums, low, high);
        nums = quickSort(nums, low, pi - 1);
        nums = quickSort(nums, pi + 1, high);
    }
        return nums;
    }

    public int getPivot(int[] nums, int low, int high){
        int target = nums[low];
        int start = low;
        int end = high;
        while(start < end){
        while(start <= high && target >= nums[start]){
            start++;
        }
        while (end >= low + 1 && target < nums[end]){
            end--;
        }
        if(start < end){
            swap(nums, start, end);
            System.out.println(Arrays.toString(nums));
        }}
        swap(nums, low, end);
            System.out.println(Arrays.toString(nums));
        return end;
    }


    public int[] swap(int[] nums, int start, int end){
        
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        return nums;
    }
}
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {

    public int[] mergeSort(int[] nums, int left, int right){

        System.out.print(left);
        System.out.print(" ");
        System.out.print(right);
        System.out.print(" then -> ");
        if(left<right){
            int mid = (left+right)/2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1, right);
            System.out.println(" ");
            nums = merge(nums, left, mid, right);
        }
        return nums;
    }
    
    public int[] merge(int[] nums, int left, int mid, int right){
        int[] sorted = new int[nums.length];
        int idx = left;
        int i = left;
        int j = mid + 1;
        while(i< mid + 1 && j <= right){
        if(nums[i]<nums[j]){
            sorted[idx] = nums[i];
            i++; 
        } else {
            sorted[idx] = nums[j];
            j++;
        }
        idx++;}
        if(i>mid){
            while(j <= right){
                sorted[idx] = nums[j];
                j++; idx++;
            }
        } else {
            while(i < mid + 1){
                sorted[idx] = nums[i];
                i++; idx++;
            }
        }
        while(idx<nums.length){
            sorted[idx] = nums[idx];
            idx++;
        }
        System.out.println(Arrays.toString(sorted));
        return sorted;
    }
}

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {

    public int[] mergeSort(int[] nums, int left, int right){
        if(left<right){
            int mid = (left+right)/2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            mergedArray(nums, left, mid, right);
        }
        return nums;
    }

    private int[] mergedArray(int[] nums, int left, int mid, int right){
        int size1 = mid-left+1;
        int size2 = right-mid;
        int[] sortedArray1 = new int[size1];
        int[] sortedArray2 = new int[size2];

        for(int x = 0; x < size1; x++){
            sortedArray1[x] = nums[left+x];
        }

        for(int x = 0; x < size2; x++){
            sortedArray2[x] = nums[mid+1+x];
        }

        int i =0;
        int j =0;
        int k =left;

        while(i<size1 && j<size2){
        if(sortedArray1[i]<=sortedArray2[j]){
            nums[k] = sortedArray1[i];
            i++;
        } else{
            nums[k] = sortedArray2[j];
            j++;   
        }
        k++;}

        while(i<size1){
            nums[k] = sortedArray1[i];
            i++; k++;
        }

        while(j<size2){
            nums[k] = sortedArray2[j];
            j++; k++;
        }

        return nums;

    }
}

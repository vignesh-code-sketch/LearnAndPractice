

import java.util.Arrays;

class hello {

    public static void main(String[] args) {

        int[] nums                      = {6,3,8,2,9,5,7,1,12,19,25,46,0,11};
        int[] nums2 = {6,3,8,2,9,5,7,1,12,19,25,46,0,18};
        System.out.println(Arrays.toString(nums));

        // Hello hello                     = new Hello();
        // InsertionsSort a = new InsertionsSort();
        // int[] sorted2 = a.insertionSort(nums);
        
        // System.out.println("selection sort : ");
        // System.out.println(Arrays.toString(sorted2));
        // int[] sorted                    = hello.selectionSort(nums2);
        // System.out.println(Arrays.toString(sorted));

        // quickSort qs = new quickSort();
        // nums = qs.quickSort(nums, 0, nums.length-1);
        // System.out.println(Arrays.toString(nums));

        

        mergeSort ms = new mergeSort();
        nums = ms.mergeSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));



        }

        public int[] selectionSort(int[] nums){

            
            for(int j = 0; j < nums.length - 1; j++){
                int maxIdx              = 0;
            int max                     = nums[maxIdx];
            for (int i = 0; i < nums.length - j; i++){
                if(max<nums[i]){
                    max                 = nums[i];
                    maxIdx              = i;
                }
            }
            nums[maxIdx]                = nums[nums.length - j -1];
            nums[nums.length - j - 1]   = max;
            
        // System.out.println(Arrays.toString(nums));
        }

        return nums;
        }
    }


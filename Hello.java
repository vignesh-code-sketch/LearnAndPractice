

import java.util.Arrays;

class Hello {

    public static void main(String[] args) {

        int[] nums                      = {6,3,8,2,9,5,7,1,12,19,25,46,0,11};
        System.out.println(Arrays.toString(nums));

        Hello hello                     = new Hello();
        InsertionsSort a = new InsertionsSort();
        int[] sorted2 = a.insertionSort(nums);
        
        System.out.println("insertion sort : ");
        System.out.println(Arrays.toString(sorted2));
        int[] sorted                    = hello.selectionSort(nums);
        System.out.println(Arrays.toString(sorted));


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
            
        System.out.println(Arrays.toString(nums));
        }

        return nums;
        }
    }


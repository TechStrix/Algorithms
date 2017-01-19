/**
 * Created by Dungeoun on 1/18/17.
 */
public class Solution {

    public static int[] insertionSort(int[] nums){

        int x = 0;

        for( int i=1; i< nums.length; i++){

            x = nums[i];

            int j = i-1;

            while( j>=0 && nums[j] > x){

                nums[j+1] = nums[j];        // Shifts

                j = j - 1;

            }

            nums[j+1] = x;                  // Insertions

        }

        return nums;
    }

    public static void main(String args[]){

        int[] nums = {54,64,33,12,100};

        int[] bums = new int[nums.length];

        bums = insertionSort(nums);

        for( int i = 0 ; i<nums.length ; i++){

            System.out.println(bums[i]);

        }

    }

}

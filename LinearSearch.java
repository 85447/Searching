import java.util.*;
public class LinearSearch {
    public static void main(String[] args){
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        boolean ans = Linearsearch3(nums, target);

        System.out.println(ans);
    }

    //Search in the array: return the index if item found
    //otherwise if item not found return -1
    /*static int Linearsearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        // runa for loop
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }*/
    /*static int Linearsearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        // runa for loop
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return element;
            }
        }*/

        static boolean Linearsearch3(int[] arr, int target){
            if(arr.length == 0){
                return false;
            }
            // runa for loop
            for(int index = 0; index < arr.length; index++){
                int element = arr[index];
                if(element == target){
                    return true;
                }
            }
        return false;
    }
}

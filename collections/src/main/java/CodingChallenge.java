import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CodingChallenge {

    /*
        Problem: Two Sum

            *Given an array of integer nums and an integer target, return indexes
                of the two numbers such that they add up to target.
            *You may assume that each input would have exactly one solution, and you may not use the
                same element twice.
            *You can return the answer in anay order.

        Example:

            Input: nums = [2,7,11,15]
            Output: [0,1]

        Explanation:

            Because nums[0] + nums[1] == 9, we return [0,1]
    */

    public static void main(String[] args) {

        int[] myarray = {2,7,9,11};
        System.out.println(Arrays.toString(twoSum1(myarray, 9)));

        //How to optimize the code?
        // use a hashmap

        System.out.println(Arrays.toString(twoSum2(myarray, 9)));

    }

    public static int[] twoSum1(int[] array, int targetValue) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] + array[j] == targetValue) return  new int[]{i,j};
            }
        }
        return new int[2];
    }

    public static int[] twoSum2(int[] array, int targetValue) {
        Map<Integer, Integer> map= new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int potentialMatch = targetValue-array[i];
            if(map.containsKey(potentialMatch)) return new int[]{i, map.get(potentialMatch)};
            else map.put(array[i], i);
        }
        return new int[]{};
    }

}

package leetcodePractice;
/**
 * <h3>Leetcode Problems #167</h3>
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 *
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 *
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 *
 * Your solution must use only constant extra space.
 *
 *<br><br>
 * Example 1:<br>
 * Input: numbers = [2,7,11,15], target = 9<br>
 * Output: [1,2]<br>
 * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].<br>
 * <br>
 * Example 2:<br>
 * Input: numbers = [2,3,4], target = 6<br>
 * Output: [1,3]<br>
 * Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].<br>
 * <br>
 * Example 3:<br>
 * Input: numbers = [-1,0], target = -1<br>
 * Output: [1,2]<br>
 * Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].<br>
 * <br>
 * Constraints:<br>
 *
 * 2 <= numbers.length <= 3 * 104<br>
 * -1000 <= numbers[i] <= 1000<br>
 * numbers is sorted in non-decreasing order.<br>
 * -1000 <= target <= 1000<br>
 * The tests are generated such that there is exactly one solution.<br>
 */
public class TwoSumII_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {

        int l = 0, r = numbers.length - 1;

        while (numbers[l] + numbers[r] != target) {
            if (numbers[l] + numbers[r] > target) {
                r--;
            } else {
                l++;
            }
            if (r == l) {
                return new int[]{};
            }
        }
        return new int[]{l + 1, r + 1};

        /*
        int[] result = new int[2];
        for (int i = 1; i <= numbers.length; i++){
            for (int n = i+1; n <= numbers.length; n++){
                if (numbers[i-1]+numbers[n-1]==target){
                    result[0] = i;
                    result[1] = n;
                }
            }
        }
        return result;
         */
    }
}

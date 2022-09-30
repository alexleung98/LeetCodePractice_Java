package leetcodePractice;

/** <h3>Leetcode Problems #1</h3>
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * You can return the answer in any order.
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++){
            for (int j = 0; j < i; j++){
                if(nums[i]+nums[j]==target){
                    int[] solution = new int[]{j,i};
                    return solution;
                }
            }
        }
        return null;
    }




}

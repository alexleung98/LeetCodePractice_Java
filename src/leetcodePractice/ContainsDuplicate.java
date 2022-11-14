package leetcodePractice;

import java.util.HashSet;
import java.util.Set;

/**
 * <h3>Leetcode Problems #217</h3>
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * <br><br>
 * Example 1:
 * <br>
 * Input: nums = [1,2,3,1]<br>
 * Output: true<br>
 * Example 2:
 * <br>
 * Input: nums = [1,2,3,4]<br>
 * Output: false<br>
 * Example 3:
 * <br>
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]<br>
 * Output: true<br>
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i: nums){
            if (!set.add(i)){
                return true;
            }
        }
        return false;

    }

}

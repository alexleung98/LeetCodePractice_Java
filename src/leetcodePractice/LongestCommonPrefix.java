package leetcodePractice;

/**
 * <h3>Leetcode Problems #14</h3>
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 * <br>
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * <br>
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * <br>
 * Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";
        String pre = strs[0];

        for (int i = 1; i < strs.length; i++){
            //StringA.indexOf(StringB) 用来检查A是否有B开头，true||B=="" -> 0, false -> -1
            while(strs[i].indexOf(pre) != 0){
                pre = pre.substring(0,pre.length()-1);//从末位剔除
            }
        }
        return pre;
    }

}

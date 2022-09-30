package leetcodePractice;
import java.util.Arrays;

/** <h3>Leetcode Problems #9</h3>
 *
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward.
 *
 * For example, 121 is a palindrome while 123 is not.
 */

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String y = Integer.toString(x);
        char[] ys1 = new char[y.length()];
        for (int i = 0; i<y.length(); i++){
            ys1[i] = y.charAt(i);
        }

        String yReverse = new StringBuilder(y).reverse().toString();
        //StringBuilder

        char[] ys2 = new char[yReverse.length()];
        for (int i = 0; i<yReverse.length(); i++){
            ys2[i] = yReverse.charAt(i);
        }

        if (Arrays.equals(ys1, ys2)){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

}

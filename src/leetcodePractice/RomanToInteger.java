package leetcodePractice;

/**<h3>Leetcode Problems #13</h3>
 *
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 */

public class RomanToInteger {
    public static int romanToInt(String s){

        //建立和s长度相同的int[]
        int[] number = new int[s.length()];

        //遍历s
        for (int i = 0; i<s.length(); i++){
            switch (s.charAt(i)){
                case 'M':
                    number[i] = 1000;
                    break;
                case 'D':
                    number[i] = 500;
                    break;
                case 'C':
                    number[i] = 100;
                    break;
                case 'L':
                    number[i] = 50;
                    break;
                case 'X':
                    number[i] = 10;
                    break;
                case 'V':
                    number[i] = 5;
                    break;
                case 'I':
                    number[i] = 1;
                    break;
            }
        }

        int result = 0;

        for (int i = 0; i<number.length-1; i++){
            if(number[i]<number[i+1]){
                result = result - number[i];
            }else {
                result = result + number[i];
            }
        }

        result = result+number[number.length-1];

        return result;
    }
}

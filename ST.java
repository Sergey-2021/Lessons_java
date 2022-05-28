import java.lang.reflect.Type;
import java.util.Arrays;

public class ST {
    public static void main(String[] args ) {
        System.out.println(number(4421));
    }
    /**
     * Реализовать функцию возведения числа а в степень b. a, b ∈ Z. 
     * Сводя количество выполняемых действий к минимуму. 
     * Пример 1: а = 3, b = 2, ответ: 9 
     * Пример 2: а = 2, b = -2, ответ: 0.25
     * Пример 3: а = 3, b = 0, ответ: 1
     */
    public static double powRec( double a, int b){
        if (b == 0) return 1;
        if (b < 0) return powRec(1/a, -b);
        double res = powRec(a, b/2);
        return b % 2 == 0 ? res * res : res * res * a;
    }
    /**
     * Given a zero-based permutation nums (0-indexed), build an array
     *  ans of the same length where ans[i] = nums[nums[i]] 
     * for each 0 <= i < nums.length and return it.

     * from 0 to nums.length - 1 (inclusive).
    */
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length] ;
        for(int i = 0; i < nums.length; i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
    /**
     * На вход некоторому исполнителю подаётся два числа (a, b).
     *  У исполнителя есть две команды
     * - команда 1 (к1): увеличить в с раза, а умножается на c
     * - команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
     * написать программу, которая выдаёт набор команд,
     *  позволяющий число a превратить в число b или сообщить, 
     * что это невозможно
     * Пример 1: а = 1, b = 7, c = 2, d = 1
     * ответ: к1, к1, к1, к1, к1, к1 
     * или к1, к2, к1, к1, к1 
     * или к1, к1, к2, к1. 
     */
    public static StringBuilder MyYes(int a,int b) {
        StringBuilder patch = new StringBuilder();
        int c = a;
        int[] dd = new int[b];
        String ss = dd.toString();
        System.out.println(ss);
        while (c > 0){
            for (int i = 0; i < b; i++) {     
                patch.append("0");    
            }
            c--;
        }
        return patch;
    }
    /** Given an integer number n, return the difference 
     * between the product of its digits and the sum of its digits.
    */    
    public static int number(int a) {
        int prod = 1;
        int sum = 0;
        int i = a;
        while (i > 0){
            prod *= i % 10;
            sum += i % 10;
            i = i / 10;
        }
        int result = prod - sum;
        return result;
    }
    
}

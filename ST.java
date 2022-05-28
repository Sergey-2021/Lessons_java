import java.util.Arrays;

public class ST {
    public static void main(String[] args ) {
        int[] a = {2,1,3,4,0};
        System.out.println(Arrays.toString(buildArray(a)));
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
}

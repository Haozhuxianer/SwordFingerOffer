import java.util.ArrayList;
import java.lang.Math;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        int low = 0;
        int high = 1;
        ArrayList result = new ArrayList<Integer>();
        for (int i = 0 ; i < array.length ; i++) {
            for (int j = 0 ; j < array.length ; j++) {
                if (i == j) continue;
                if (array[i] + array[j] == sum) {
                    result.add(array[i]);
                    result.add(array[j]);
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s  = new Solution();
        int[] array = {1,2,4,7,11,15};
        System.out.println(s.FindNumbersWithSum(array, 15));
    }
}


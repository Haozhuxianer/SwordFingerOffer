import java.util.ArrayList;
import java.lang.Math;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        int low = array.length / 2;
        int high = array.length / 2 + 1;
        int cur = array[low] + array[high];
        ArrayList result = new ArrayList<Integer>();
        while(low < high) {
	    System.out.println("");
            System.out.println("test");
        }
    }

    public static void main(String[] args) {
        Solution s  = new Solution();
        int[] array = {1,2,4,7,11,15};
        System.out.println(s.FindNumbersWithSum(array, 15));
    }
}


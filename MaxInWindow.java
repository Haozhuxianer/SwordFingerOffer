import java.util.ArrayList;

public class MaxInWindow{

    public ArrayList<Integer> solution(int[] num, int size){
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(size > num.length || num.length <= 0 || size <= 0) return result;
        int low = 0;
        int high = size - 1;
        while(high < num.length){
            int max = -1;
            for(int i = low; i <= high; i++){
                if(num[i] > max) max = num[i];
            }
            result.add(max);
            low++;
            high++;
        }
        return result;
    }

    public static void main(String[] args){
        MaxInWindow m = new MaxInWindow();
        int[] num = {2,3,4,2,6,2,5,1};
        System.out.print(m.solution(num, 3).toString());
    }
}

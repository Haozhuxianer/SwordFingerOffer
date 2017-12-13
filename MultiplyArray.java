public class MultiplyArray{
    public int[] solution(int[] A){
        int[] b = new int[A.length];
        for(int i = 0; i < A.length; i++){
            b[i] = 1;
        }
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                if (j == i) continue;
                b[i] *= A[j];
            }
        }
        return b;
    }

    public static void main(String[] args){
        MultiplyArray m = new MultiplyArray();
        int[] a = {1,2,3,4,5};
        int[] b = m.solution(a);
        for(int i = 0; i < b.length; i++)
            System.out.print(" " + b[i]);
    }
}

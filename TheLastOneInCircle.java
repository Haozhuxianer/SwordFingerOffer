public class TheLastOneInCircle{

    public int solution(int n, int m){
        int[] kids =new int[n];
        int j = 0;
        int i = 0;
        int count = n;
        while(count > 0){
            for(;;i++){
                if(i == n) i = 0;
                if(kids[i] == 1) continue;
                if(j == m-1){
                    System.out.println("the turn:" + (n - count)  + "gift kid:" + i);
                    kids[i] = 1;
                    j = 0;
                    i++;
                    break;
                }
                j++;
            }
            count--;
        }
        return i-1;
    }

    public static void main(String[] args){
        TheLastOneInCircle t = new TheLastOneInCircle();
        System.out.println(t.solution(5,3));
    }
}

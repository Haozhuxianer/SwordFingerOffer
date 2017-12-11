public class TheLastOneInCircle2{
    public int solution(int n, int m){
        if (n == 0) return -1;
        if (n == 1) return 0;
        return (solution(n-1, m) + m)%n;
    }

    public static void main(String[] args){
        TheLastOneInCircle2 t = new TheLastOneInCircle2();
        System.out.println(t.solution(5,3));
    }
}

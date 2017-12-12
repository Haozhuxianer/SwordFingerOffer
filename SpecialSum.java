public class SpecialSum{

    public int solution(int n){
        int result = n;
        boolean t = (result != 0) && ((result += solution(n-1)) != 0);
        return result;
    }

    public static void main(String[] args){
        SpecialSum s = new SpecialSum();
        System.out.println(s.solution(3));
    }
}

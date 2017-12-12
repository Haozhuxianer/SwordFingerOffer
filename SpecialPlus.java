public class SpecialPlus{
    public int solution(int num1, int num2){
        while(num2 != 0){
            int temp = num1 ^ num2;
            num2 = (num1 & num2)<<1;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args){
        SpecialPlus s = new SpecialPlus();
        System.out.println(s.solution(1,2));
    }
}

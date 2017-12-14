public class IsNumeric{

    public boolean solution(char[] str){
        String s = String.valueOf(str);
        return s.matches("[\\+-]?[0-9]*(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?");
    }
    public static void main(String[] args){
        IsNumeric i = new IsNumeric();
        String s = "";
        System.out.println(i.solution(s.toCharArray()));
    }
}

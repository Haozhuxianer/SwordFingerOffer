public class LeftRotateStringBetter {

    public String solution(String str, int n){
        int len = str.length();
        if (len == 0) return "";
        n = n % len;
        StringBuilder a = new StringBuilder(str);
        a.append(str);
        System.out.println(a.toString());
        return a.substring(n, len + n);
    }

    public static void main(String[] args){
        LeftRotateStringBetter l = new LeftRotateStringBetter();
        System.out.println(l.solution("helloWorld", 2));
    }
}

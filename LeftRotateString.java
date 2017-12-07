import java.util.ArrayList;
import java.lang.Math;

public class LeftRotateString {

    public String solution(String str, int n) {
        char[] s = str.toCharArray();
        StringBuilder a = new StringBuilder();
        int len = s.length;
        if (n > len) n = n % len;
        if (n < len) {
            for(int i = n; i < len; i++){
                a.append(s[i]);
            }
            for(int i = 0; i < n; i++){
                a.append(s[i]);
            }
        }
        if (n == len) {
            a.append(s);
        }
        System.out.println("the Result:"+a);
        return a.toString();
    }

    public static void main(String[] args) {
         LeftRotateString l = new LeftRotateString();
        System.out.println(l.solution("Hello World" , 11));
    }
}

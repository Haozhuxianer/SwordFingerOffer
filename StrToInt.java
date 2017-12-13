public class StrToInt{
    public int solution(String str){
        if (str.equals("") || str.length() == 0)
            return 0;
        char[] a = str.toCharArray();
        int mark = 0;
        if (a[0] == '-')
            mark = 1;
        int sum = 0;
        for (int i = mark; i < a.length; i++){
            if (a[i] == '+')
                continue;
            if (a[i] < 48 || a[i] > 57)
                return 0;
            sum = sum * 10 + a[i] - 48;
        }
        return markt == 0 ? sum : sum * -1;
    }

    public static void main(String[] args){
        StrToInt s = new StrToInt();
        System.out.println(s.solution("-13233op525"));
    }
}

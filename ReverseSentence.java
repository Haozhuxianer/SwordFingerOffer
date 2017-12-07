public class ReverseSentence {

    public String solution(String str){
        if (str.trim().equals("")) return str;
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--){
            result.append(words[i]);
            if(i > 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args){
        ReverseSentence r = new ReverseSentence();
        System.out.println(r.solution(" "));
    }
}

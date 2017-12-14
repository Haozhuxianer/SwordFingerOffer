public class RegularExpressionMatch{

    public boolean solution(char[] str, char[] pattern){
        int sIndex = 0;
        int pIndex = 0;
        while(pIndex < pattern.length){
            if(pIndex < pattern.length-1 && pattern[pIndex+1] == '*'){
                if(pattern[pIndex] == '.') return true;
                while(sIndex < str.length && str[sIndex] == pattern[pIndex]) sIndex++;
                pIndex += 2;
                System.out.println("now sIndex:"+sIndex+"now pIndex"+pIndex);
            }else if(pattern[pIndex] == '.'){
                pIndex++;
                sIndex++;
            }else{
                if(str[sIndex] != pattern[pIndex]) return false;
                pIndex++;
                sIndex++;
            }
            if(sIndex == str.length) break;
        }
        if(sIndex == str.length && pIndex == pattern.length)
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        String s1 = "a";
        String s2 = "ab*a";
        RegularExpressionMatch r = new RegularExpressionMatch();
        System.out.println(" " + r.solution(s1.toCharArray(), s2.toCharArray()));
    }
}

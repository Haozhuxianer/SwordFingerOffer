public class DuplicatedArray{

    public int solution(int[] numbers, int length){
        int[] help = new int[length];
        for(int i = 0; i < length; i++){
            help[i] = -1;
        }
        for(int i = 0; i < length; i++){
            if(help[numbers[i]] == numbers[i]){
                return numbers[i];
            }else{
                help[numbers[i]] = numbers[i];
            }
        }
        return 0;
    }

    public static void main(String[] args){
        DuplicatedArray d = new DuplicatedArray();
        int[] a = {2,3,1,0,2,5,3};
        System.out.println(d.solution(a, a.length));
    }
}

public class DuplicatedArray{

    public int solution(int[] numbers, int length){
        for(int i = 0; i < length - 1; i++){
            for(int j = i + 1; j < length; j++){
                if(numbers[i] == numbers[j]) return numbers[i];
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

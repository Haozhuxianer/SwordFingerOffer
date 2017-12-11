public class PokerOrder{

    public boolean solution(int[] numbers){
        if (numbers.length < 5) return false;
        int count = 0;
        int len = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0 ; j < 4 - i; j++ ){
                if (numbers[j] > numbers[j + 1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < 4; i++){
            if (numbers[i] == 0){
                count++;
                continue;
            }
            if (numbers[i] == numbers[i+1]){
                return false;
            } else {
                int temp = numbers[i+1] - numbers[i];
                if(temp > 1){
                    len += temp - 1;
                }
            }
        }
        System.out.println("the count:" + count + "the len:" + len);
        if(len > count) return false;
        else return true;
    }

    public static void main(String[] args){
        PokerOrder p = new PokerOrder();
        int[] a = {0,0,0,0,4};
        System.out.println(p.solution(a));
    }
}

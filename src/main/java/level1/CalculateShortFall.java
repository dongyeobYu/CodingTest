package level1;

class CalculateShortFall {
    public long solution(int price, int money, int count) {
        long answer;
        long price1;
        long sum = 0;

        for(int i=1; i<count+1; i++){
            price1 = (long)price * i;
            sum += price1;
        }

        answer = sum - money;

        if (sum < money){
            return 0;
        }

        return answer;
    }
}
package level1;


class cola {
    public int solution(int a, int b, int n) {
        int answer = 0;

        if(a > b){
            while(n - a >= 0){
                n -= a;
                n += b;

                answer += b;
            }
        }
        return answer;
    }
}
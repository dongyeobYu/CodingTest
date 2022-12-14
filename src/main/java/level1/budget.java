package level1;

import java.util.Arrays;

class budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int tmp = 0;
        for(int i=0; i<d.length; i++){
            for(int j=0; j<d.length; j++){
                if(d[i] < d[j]) {
                    tmp = d[i];
                    d[i] = d[j];
                    d[j] = tmp;
                }
            }
        }
        int sum = 0;
        for(int i=0; i<d.length; i++){
            if(d[i] + sum <= budget){
                sum+=d[i];
                answer++;
            }
        }


        return answer;
    }
}

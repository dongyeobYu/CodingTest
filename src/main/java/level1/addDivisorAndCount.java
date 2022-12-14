package level1;

import java.util.*;

class addDivisorAndCount {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            ArrayList<Integer> l = new ArrayList<Integer>();
            for(int j=1; j<=i; j++){
                if(i % j == 0){
                    l.add(i);
                }
            }
            if(l.size() % 2 == 0){
                answer += i;
            } else{
                answer -= i;
            }
        }


        return answer;
    }
}
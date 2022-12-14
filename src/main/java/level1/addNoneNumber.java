package level1;

import java.util.*;

class addNoneNumber {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        for(int i=0; i<10; i++){
            if(Arrays.binarySearch(numbers, i) < 0){
                answer += i;
            }

        }
        return answer;
    }
}
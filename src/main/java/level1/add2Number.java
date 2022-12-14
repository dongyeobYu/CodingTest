package level1;

import java.util.*;

class add2Number {
    public int[] solution(int[] numbers) {
        int tmp = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=(i+1); j<numbers.length; j++){
                tmp = numbers[i] + numbers[j];
                hs.add(tmp);
            }
        }
        int[] answer = new int[hs.size()];
        hs.stream().sorted();
        int k=0;
        for(Integer i : hs){
            answer[k++] = i;
        }

        int min_number = 0;
        for(int i=0; i<hs.size(); i++){
            for(int j=0; j<hs.size(); j++){
                if(answer[i] < answer[j]){
                    min_number = answer[i];
                    answer[i] = answer[j];
                    answer[j] = min_number;
                }
            }
        }
        return answer;
    }
}
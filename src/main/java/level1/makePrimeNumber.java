package level1;

import java.util.*;

class makePrimeNumber {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> hs = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j=(i+1); j<nums.length; j++){
                for(int k = (j+1); k<nums.length; k++){
                    int tmp = nums[i] + nums[j] + nums[k];
                    if(isPrime(tmp)){
                        hs.add(tmp);
                    }
                }
            }
        }
        System.out.println(hs);
        answer = hs.size();
        return answer;
    }

    boolean isPrime(int in){
        for(int i=2; i<=Math.sqrt(in); i++){
            if(in % i == 0) {
                return false;
            }
        }
        return true;
    }
}
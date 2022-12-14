package level1;

import java.util.*;

class KSecondNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int k=0; k < commands.length; k++) {
            int firstindex = commands[k][0] - 1;
            int lastindex = commands[k][1];
            int[] tmp = new int[lastindex-firstindex];
            int i = 0;

            for (int j = firstindex; j < lastindex; j++) {
                tmp[i] = array[j];
                i += 1;
            }

            Arrays.sort(tmp);
            int x;
            x = commands[k][2] - 1;
            answer[k] = tmp[x];
        }
        return answer;
    }


}
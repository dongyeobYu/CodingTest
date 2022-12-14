package level1;

class leastRectangle {
    public int solution(int[][] sizes) {
        int answer = 0;
        int tmp = 0;
        int max = 0;
        int min = 0;

        for(int i=0; i<sizes.length; i++){
            if(sizes[i][1] < sizes[i][0]){
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }

        for(int i=0; i<sizes.length; i++){
            if(max < sizes[i][0]){
                max = sizes[i][0];
            }
        }

        for(int i=0; i<sizes.length; i++){
            if(min < sizes[i][1]){
                min = sizes[i][1];
            }
        }

        answer = max * min;
        return answer;
    }
}
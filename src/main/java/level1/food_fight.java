package level1;

class food_fight {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        String n1 = "";

        for(int i=1; i<food.length; i++){
            if(food[i] == 1){
                continue;
            }

            if(food[i] % 2 == 1){
                food[i] = food[i] - 1;
            }

            food[i] = food[i] / 2 ;
            for(int j=0; j<food[i]; j++){
                n1 += i;
                answer.append(i);
            }
        }

        answer.append(0);

        for(int n=n1.length() - 1; n>-1; n--){
            answer.append(n1.charAt(n));
        }


        return answer.toString();
    }
}
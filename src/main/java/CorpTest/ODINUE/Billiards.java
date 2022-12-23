package CorpTest.ODINUE;

import static java.lang.Thread.sleep;

public class Billiards{
    public static void main(String[] args) throws InterruptedException {
        /**
         * 당구
         * 질문 1 코드 구조의 A, B를 작성하시오
         */
//        x, y 는 공의 초기값
        int x = 2;
        int y = 2;

//        공의 반지름(r) 은 1로 가정
        final int r = 1;

//        dx, dy 는 1으로 가정
        int dx = 1;
        int dy = 1;

//        높낮이는 5,10 으로 가정
        final int w = 5;
        final int h = 10;

        while(true){
            sleep(1000);

            x = x + dx;
            y = y + dy;

            if( ((x + r >= w) || (x - r <= 0))  ) {
                dx = -dx;
            }

            if((y + r >= h) || (y - r <= 0)){
                dy = -dy;
            }

        }
    }
}

/**
 * 질문2
 * 1초마다 반복하되, 공의 이동속도를 높이기 위해 조절해야하는 변수는 무엇이며 속도는 어떻게 정의할 수있는가?
 *
 * 조절해야하는 변수는 dx, dy
 * 속도는 거리/시간 즉, 거리^2 =  dx^2 + dy^2 시간은 1로 가정한다.
 */

/**
 * 질문3
 * 이동하는 각도를 바꾸기 위해 조절해야 하는 변수는 무엇이며 각도는 어떻게 정의 할 수 있는가?
 * 조절해야하는 변수는 dx, dy 의 부호
 * 각도는 각 x, y의 연산을 따로해 w, h 에 먼저 도달하면 부호를 변경한다.
 */


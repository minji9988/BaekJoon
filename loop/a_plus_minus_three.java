//
//
//        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//        첫째 줄에 테스트 케이스의 개수 T가 주어진다.

package loop;

import java.util.Scanner;

public
class a_plus_minus_three {
    public static
    void main ( String[] args ) {

        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt(); // 몇 번 반복할 건지 입력
        int [] result = new int[count];


        //입력된 숫자만큼 더해줌
        for (int i=0; i<count; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();

            result[i] = A + B;

        }

        // 입력된 숫자만큼 출력
        for (int i=0; i<count; i++){
            System.out.println(result[i]);

        }



    }

}

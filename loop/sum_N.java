package loop;

import java.util.Scanner;

public
class sum_N {

    public static void main ( String[] args ) {

        // n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // 사용자가 입력한 N 값 저장
        scan.close();

        int sum = 0;

        //입력된 숫자만큼 더해줌
        for (int i=1; i<=n; i++) {
            sum += i;

            System.out.println(sum);

        }




    }


}

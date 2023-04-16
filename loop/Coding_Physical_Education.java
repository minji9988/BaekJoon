package loop;

import java.util.Scanner;

public
class Coding_Physical_Education {

    public static
    void main ( String[] args ) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); // 숫자 입력
        scan.close();

        int numberOfLong = Integer.parseInt(String.valueOf(num)); //long이 출력되는 개수
        // 4를 입력했다면 long 1개, 8을 입력했다면 long 2개다.

        String resultOfLong[] = new String[numberOfLong];

        for (int i=0; i<numberOfLong/4; i++) {

            resultOfLong[i] = "long ";

        }

        System.out.println(resultOfLong + " int");
    }
}

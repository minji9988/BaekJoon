package loop;

import java.util.Scanner;

public
class Coding_Physical_Education {

    public static
    void main ( String[] args ) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); // 숫자 입력
        scan.close();

        // 사용자가 4를 입력했다면 long 1개, 8을 입력했다면 long 2개를 출력하도록 한다.
        for (int i=0; i<num/4; i++) { //
            System.out.print("long "); //long 바로 뒤에 int가 나와야 함으로 println이 아닌 print 작성
        }
        System.out.println("int");
    }
}

import java.util.Scanner;

public
class Main {

    public static
    void main ( String[] args ) {

        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt(); // 몇 번 덧셈연산을 해줄 건지 입력
        int [] result = new int[count]; // 더해진 숫자들이 저장될 배열 선언


        //입력된 숫자들을 더해 줌
        for (int i=0; i<count; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();

            result[i] = A + B; //입력된 숫자들은 result란 배열에 저장됨

        }

        // 더해준 숫자들을 출력
        for (int i=0; i<count; i++){
            System.out.println(result[i]);

        }


    }
}

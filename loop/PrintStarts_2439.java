package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStarts_2439 {
    public static
    void main ( String[] args ) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Scanner와 유사

        int count = Integer.parseInt(br.readLine());
        // readLine은 입력을 받을 때 사용하는 메서드다. next 메서드 느낌?
        // br.readLine()이 scan.nextInt 느낌. ex) int n = scan.nextInt();
        //  readLine 메서드로 입력받은 건 String type으로 고정되서 다른 타입으로 입력받으려 할 땐
        // 형 변환이 필요하다. 여기선 정수형으로 받아줘야 해서 Integer.parseInt를 작성해서 String을 int로 바꿔줬다.


        for (int i = 1; i <= count; i++) {
            for (int spaces = count - i; spaces > 0; spaces--) { // 입력받은 수에서 -1 해주고, 결과값만큼 스페이스바
                System.out.print(" ");
            }
            for (int stars = 1; stars <= i; stars++) { // i만큼 별 출력
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
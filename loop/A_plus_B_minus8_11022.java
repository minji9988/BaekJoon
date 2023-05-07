package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_plus_B_minus8_11022 {

    public static void main ( String[] args ) throws IOException { //Buffer 사용 시에는 예외처리를 해줘야 한다!


        //BufferReader를 사용해서 A+B 만들기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Scanner와 유사

        int count = Integer.parseInt(br.readLine());
        // readLine은 입력을 받을 때 사용하는 메서드다. next 메서드 느낌?
        // br.readLine()이 scan.nextInt 느낌. ex) int n = scan.nextInt();
        //  readLine 메서드로 입력받은 건 String type으로 고정되서 다른 타입으로 입력받으려 할 땐
        // 형 변환이 필요하다. 여기선 정수형으로 받아줘야 해서 Integer.parseInt를 작성해서 String을 int로 바꿔줬다.

        StringTokenizer num;

        for (int i = 1; i <= count; i++) { //n에 입력된 숫자만큼 덧셈 연산 반복
            num = new StringTokenizer(br.readLine());
            //StringTokenizer //띄어쓰기 단위로 데이터를 가공한다.
            // 원래 BufferedReader를 통해 읽어온 데이터는 개행문자 단위(엔터 단위 혹은 한 줄 단위)로 나누어진다.
            // 만약 공백 단위(띄어쓰기 혹은 스페이스바 단위)로
            // 데이터를 가공하고자 하면 StringTokenizer 메서드를 사용하면 된다.
            // 우리는 두 개의 숫자를 공백 단위로 입력받을 거다.
            // 예) 1 2 이런 식으로 공백(스페이스바 단위)로 입력받으려고 하지
            // 1
            // 2 이렇게 엔터 단위로 입력받으려는 것이 아니다. 그래서 공백단위로 입력받는 StringTokenizer를 사용한다.

            // 그래서 num 한 개만 작성해 놔도 내가 1 2 3 이렇게 입력하면
            // num에 1 2 3 이 저장된다. 띄어쓰기 단위로 데이터를 가공하니까.
            // 그래서 굳이 int A = in.nextInt(), int B= in.nextInt(), int C= in.nextInt() 이렇게 하나하나 만들 필요가 없다.

            System.out.println("Case #" + i + ": " +(Integer.parseInt(num.nextToken()) + Integer.parseInt(num.nextToken())));
//            num.nextToken() 은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환시켜준다.

        }

        br.close();

    }
}

package loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Fast_A_Plus_B_15552 {
    public static void main ( String[] args ) throws  IOException { //Buffer 사용 시에는 예외처리를 해줘야 한다!

        //BufferReader를 사용해서 A+B 만들기

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Scanner와 유사
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // System.out.prinln()과 유사

            int n = Integer.parseInt(br.readLine());
            // readLine은 입력을 받을 때 사용하는 메서드다. next 메서드 느낌?
            // br.readLine()이 scan.nextInt 느낌 같기도 하다.
            //  readLine 메서드로 입력받은 건 String type으로 고정되서 다른 타입으로 입력받으려 할 땐
            // 형 변환이 필요하다. 여기선 정수형으로 받아줘야 해서 Integer.parseInt를 작성해서 String을 int로 바꿔줬다.



            for (int i = 0; i < n; i++) { //n에 입력된 숫자만큼 덧셈 연산 반복
                StringTokenizer st = new StringTokenizer(br.readLine());
                //StringTokenizerms //띄어쓰기 단위로 데이터를 가공한다.
                // 원래 BufferedReader를 통해 읽어온 데이터는 개행문자 단위(엔터 단위 혹은 한 줄 단위)로 나누어진다.
                // 만약 공백 단위(띄어쓰기 혹은 스페이스바 단위)로
                // 데이터를 가공하고자 하면 StringTokenizer 메서드를 사용하면 된다.
                // 우리는 두 개의 숫자를 공백 단위로 입력받을 거다.
                // 예) 1 2 이런 식으로 공백(스페이스바 단위)로 입력받으려고 하지
                // 1
                // 2 이렇게 엔터 단위로 입력받으려는 것이 아니다. 그래서 공백단위로 입력받는 StringTokenizer를 사용한다.

                bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
                // nextToken은 문자열을 반환해서 Inter.parseInt로 int로 변
            }
            br.close();

            bw.flush();
            bw.close();

        }
    }



//        Scanner scan = new Scanner(System.in);
//
//        int count = scan.nextInt(); // 몇 번 반복할 건지 입력
//        int [] result = new int[count];
//
//
//        //입력된 숫자만큼 더해줌
//        for (int i=0; i<count; i++){
//            int A = scan.nextInt();
//            int B = scan.nextInt();
//
//            result[i] = A + B;
//
//        }
//
//        // 입력된 숫자만큼 출력
//        for (int i=0; i<count; i++){
//            System.out.println(result[i]);
//
//        }
//
//
//
//    }
//
//}

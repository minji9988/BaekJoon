import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {


        public static void main ( String[] args ) throws IOException { //Buffer 사용 시에는 예외처리를 해줘야 한다!

            //BufferReader를 사용해서 A+B 만들기

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Scanner와 유사
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // System.out.prinln()과 유사

            int n = Integer.parseInt(br.readLine());
            // readLine은 입력을 받을 때 사용하는 메서드다. next 메서드 느낌?
            // br.readLine()이 scan.nextInt 느낌 같기도 하다.
            //  readLine 메서드로 입력받은 건 String type으로 고정되서 다른 타입으로 입력받으려 할 땐
            // 형 변환이 필요하다. 여기선 정수형으로 받아줘야 해서 Integer.parseInt를 작성해서 String을 int로 바꿔줬다.


            //StringTokenizer st; //띄어쓰기 단위로 데이터 가공
            // BufferedReader를 통해 읽어온 데이터는 개행문자 단위(엔터 단위 혹은 한 줄 단위)로 나누어진다.
            // 만약 이를 공백 단위(띄어쓰기 혹은 스페이스바 단위)로
            // 데이터를 가공하고자 하면 StringTokenizer 메서드를 사용하면 된다.

            for (int i = 0; i < n; i++) { //n에 입력된 숫자만큼 덧셈 연산 반복
                //st = new StringTokenizer(br.readLine()," ");
                StringTokenizer st = new StringTokenizer(br.readLine());
                bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
                // StringTokenizer의 nextToken() 함수를 쓰면 readLine()을 통해 입력 받은 값을 공백 단위로 구분하여 순서대로 호출할 수 있다.
            }
            br.close();

            bw.flush();
            bw.close();

        }
    }

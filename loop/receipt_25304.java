package loop;

import java.util.Scanner;

public class receipt_25304 {

    public static void main ( String[] args ) {


        Scanner scan = new Scanner(System.in);
        int receiptTotal = scan.nextInt(); // 영수증에 쓰인 총 합계
        int numberOfTypesOfObject = scan.nextInt(); // 물건의 종류 개수

        int priceTotal = 0;

        for (int i=0; i<numberOfTypesOfObject; i++) {

            int priceOfObject = scan.nextInt(); // 물건의 가격
            int numberOfObject = scan.nextInt(); // 물건의 개수


            int price = numberOfObject * priceOfObject; // 물건 개수 * 물건 가격
            priceTotal += price; //각각의 (물건 개수 * 물건 가격)의 합을 누적해서 더해준다.

        }

        scan.close();


        if(receiptTotal == priceTotal) { //영수증에 쓰인 값과 사용자가 입력한 (물건 개수*물건 가격)의 총합이 같다면
            System.out.println("Yes"); //yes 출력하시오
        } else
            System.out.println("No");



//        1. 영수증에 쓰인 총 합계 입력받기
//
//        2. 구매한 물건의 개수 입력받기
//
//        2-1. 구매한 물건의 개수만큼 반복문 돌기(모든 물건 값 더하는 것)
//
//        2-2. 물건 가격과 구입한 물건의 개수 곱해주기


    }

}

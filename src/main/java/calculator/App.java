package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요");
        int num = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요");
        int num1 = sc.nextInt();


        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0);

        System.out.println("operator = " + operator);
        // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
    }
}
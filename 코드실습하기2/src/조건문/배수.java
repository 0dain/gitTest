package 조건문;

import java.util.Scanner;

public class 배수 {

	public static void main(String[] args) {
		
		//int타입의 변수 num을 선언하고 키보드로 값 입력받기
		//입력받은 값이 3의 배수이거나 5의 배수이면 "3 또는 5의 배수입니다" 출력
		
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num=sc.nextInt();
		
		if(num%3==0||num%5==0) {
			System.out.println("3 또는 5의 배수입니다.");
		}

	}

}

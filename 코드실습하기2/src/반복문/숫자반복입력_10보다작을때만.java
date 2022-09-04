package 반복문;

import java.util.Scanner;

public class 숫자반복입력_10보다작을때만 {

	public static void main(String[] args) {
		
		//키보드로부터 입력받은 수가 10보다 작을 때만 계속 숫자를 입력할 수 있는 프로그램 작성
		//입력 받은 수 누적
		//while문, do~while문 모두 작성
		
		Scanner sc=new Scanner(System.in);
		
		//while문
//		while(true) {
//			System.out.print("숫자입력: ");
//			int num=sc.nextInt();
//			if(num>=10) {
//				break;
//			}
//		}
		
		//do~while문
		int num;
		do {
			System.out.print("숫자입력: ");
			num=sc.nextInt();
		}while(num<10);

	}

}

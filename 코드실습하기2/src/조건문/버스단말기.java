package 조건문;

import java.util.Scanner;

public class 버스단말기 {

	public static void main(String[] args) {
		
		//현재 카드 잔액과 탑승자가 성인/청소년/어린이인지 입력한 후 잔액이 충분한 경우에는 인사말을 출력하고
		//부족한 경우에는 "잔액이 부족합니다"출력
		//(성인-감사합니다(1800원)/청소년-반갑습니다(1500원)/어린이-안녕하세요(1000원))
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("잔액: ");
		int money=sc.nextInt();
		
		System.out.print("성인/청소년/어린이: ");
		String people=sc.next();
		
		if(money>=1800&&people.equals("성인")) {
			System.out.println("감사합니다");
		}else if(money>=1500&&people.equals("청소년")) {
			System.out.println("반갑습니다");
		}else if(money>=1000&&people.equals("어린이")) {
			System.out.println("안녕하세요");
		}else {
			System.out.println("잔액이 부족합니다");
		}

	}

}

package 조건문;

import java.util.Scanner;

public class 시험_과락_합불여부 {

	public static void main(String[] args) {
		
		//정수형 변수 5개를 선언한 후 정보처리기사의 각 과목의 정답 개수를 입력받아 변수에 할당
		//한 과목이라도 8개 미만인 경우 "불합격입니다" 출력 총 개수가 60개 이상이면 "합격입니다" 출력
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("소프트웨어 설계: ");
		int sw1=sc.nextInt();
		System.out.print("소프트웨어 개발: ");
		int sw2=sc.nextInt();
		System.out.print("데이터베이스 구축 입력: ");
		int db=sc.nextInt();
		System.out.print("프로그래밍 언어 활용: ");
		int pg=sc.nextInt();
		System.out.print("정보시스템 구축 관리: ");
		int ins=sc.nextInt();
		
		int sum=sw1+sw2+db+pg+ins;
		
		if(sum>=60) {
			System.out.println("합격입니다");
		}else if(sw1<8||sw2<8||db<8||pg<8||ins<8) {
			System.out.println("불합격입니다");
		}else {
			System.out.println("불합격입니다");
		}

	}

}

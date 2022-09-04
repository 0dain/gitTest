package 조건문;

import java.util.Scanner;

public class 문자비교 {

	public static void main(String[] args) {
		
		//A, B, C 입력하면 A입력, B입력, C입력이라고 출력
		//A, B, C 이외의 알파벳 입력하면 A,B<C외 입력 이라고 출력
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("알파벳 입력: ");
		String in=sc.next();//Char c=sc.next().charAt(인덱스번호); -> Char로 스캐너 입력하고 싶으면 .charAt()을 쓰면 됨
//		int in=sc.nextInt(); -> 숫자로 입력해야 해서 안 됨 ㅠㅠ, 아스키코드로 숫자 입력하면 정상 출력은 됨 ㅎ
		
		if(in.charAt(0)=='A') {//비교연산자 사용 가능한 이유는 char이 아스키코드로 인해 숫자로도 사용할 수 있기 때문!
			System.out.println("A입력");
		}else if(in.charAt(0)=='B') {
			System.out.println("B입력");
		}else if(in.charAt(0)=='C') {
			System.out.println("C입력");
		}else {
			System.out.println("A,B,C외 입력");
		}
		
//		if(in=='A') {
//			System.out.println("A입력");
//		}else if(in=='B') {
//			System.out.println("B입력");
//		}else if(in=='C') {
//			System.out.println("C입력");
//		}else {
//			System.out.println("A,B,C외 입력");
//		}
		
		
	
		
		
		

	}

}

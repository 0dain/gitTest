package 조건문;

import java.util.Scanner;

public class 시험점수합산_평균_합격 {

	public static void main(String[] args) {
		
		//JAVA, Python, Android 점수를 각각 입력받은 후 평균이 80점 보다 높으면 "합격" 출력
		Scanner sc=new Scanner(System.in);
		
		System.out.print("JAVA 점수 입력: ");
		int java=sc.nextInt();
		System.out.print("Python 점수 입력: ");
		int python=sc.nextInt();
		System.out.print("Android 점수 입력: ");
		int android=sc.nextInt();
		
		if((java+python+android)/3>80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}

	}

}

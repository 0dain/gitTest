package 반복문;

import java.util.Random;
import java.util.Scanner;

public class 랜덤수더하기 {

	public static void main(String[] args) {
		
		//1~10까지 정수 중 랜덤으로 2개를 뽑아 다음과 같이 출력 -> 5+4=
		//사용자가 값을 입력한 것이 답과 일치할 경우 "성공" 출력, 일치하지 않을 경우 "실패" 출력
		Random rd=new Random();
		Scanner sc=new Scanner(System.in);
		
		int num=0;
		int num2=0;
		
		//성공할 경우 새로운 문제 출제, 실패할 경우 기존의 문제 다시 출제
		boolean sw=true;
		
		//사용자가 답을 맞춘 횟수와 틀린 횟수 출력
		int cnt성공=0;
		int cnt실패=0;
		
		while(true) {
			if(sw==true) {//문제 맞춘 경우 새로운 랜덤 수 출력
				num=rd.nextInt(10)+1;
				num2=rd.nextInt(10)+1;
			}
			System.out.print(num+" + "+num2+" = ");	
			
			int answer=sc.nextInt();
			if(num+num2==answer) {
				System.out.println("성공");
				sw=true;//새로운 문제를 받아야 하기 때문에 sw을 true로 해줌
				cnt성공++;//맞춘 횟수 카운트
			}else {
				System.out.println("실패");
				sw=false;//틀린 경우 새로운 문제를 받을 수 없게 sw을 false로 해줌
				cnt실패++;//틀린 횟수 카운트
			}
			System.out.print("\n계속하시겠습니까? ");
			String agin=sc.next();
			
			if(agin.equals("n")||agin.equals("N")) {
				System.out.println("종료");
				break;			
			}
		}//while문 닫음
		System.out.println("맞춘 횟수: "+cnt성공+"\n틀린 횟수: "+cnt실패);
		
		
	}

}

package 삼항연산자;

import java.util.Scanner;

public class 삼항_농구공 {

	public static void main(String[] args) {
		
		//농구공을 담기 위해 필요한 상자 개수 구하기
		//상자 하나에 농구공 5개 들어갈 수 있음
		//농구공이 23개라면 필요한 상자의 개수는 5개임
		//농구공 33개 -> 상자 7개
		//농구공 20개 -> 상자 4개
		
		Scanner sc=new Scanner(System.in);
		int box;//상자
		
		System.out.print("농구공 개수: ");
		int ball=sc.nextInt();
		
		box=ball%5==0? ball/5:ball/5+1; //입력 받은 공을 5로 나눈 나머지 값이 0이면 짝수 -> 딱 맞아 떨어짐 그럼 ball/5를 하면 필요한 상자 개수가 나오고
									   //나머지 값이 0이 아니라면 홀수 -> 딱 맞아 떨어지지 않음, 상자가 부족하다는 뜻! 그래서 +1을 해줘야 함
		
		System.out.print("필요한 상자의 수: "+box);
		
		
		
		
	}

}

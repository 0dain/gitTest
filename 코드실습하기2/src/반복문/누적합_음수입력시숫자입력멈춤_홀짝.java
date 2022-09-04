package 반복문;

import java.util.Scanner;

public class 누적합_음수입력시숫자입력멈춤_홀짝 {

	public static void main(String[] args) {
		
		//숫자 반복 입력
		//-1입력시 중단
		//입력한 숫자 누적
		Scanner sc=new Scanner(System.in);
		
		int sum=0;//누적합
		int num=0;
//		while(num!=-1) {
//			System.out.print("숫자입력: ");
//			num=sc.nextInt();
//			sum+=num;
//		}
//		System.out.println("누적결과: "+sum+"(-1 계산에 포함)"); //-1값은 제외하고 누적합 결과를 보고 싶다면 sum에 +1을 해주자! -> (sum+1)
//		System.out.println("누적결과: "+(sum+1)+"(-1 계산에서 제외)"); //-1값은 제외하고 누적합 결과를 보고 싶다면 sum에 +1을 해주자! -> (sum+1)
		
		//업그레이드 입력한 숫자의 홀수와 짝수 개수 출력
		num=0;
		int cnt짝=0;//짝수
		int cnt홀=0;//홀수
		while(num!=-1) {
			System.out.print("숫자입력: ");
			num=sc.nextInt();
			if(num%2==0) {//짝수
				cnt짝++;
			}else if(num%2==1){//홀수
				cnt홀++;
			}
		}
		System.out.println("홀수 개수: "+cnt홀+"\n짝수 개수: "+cnt짝);
		
		
	}

}

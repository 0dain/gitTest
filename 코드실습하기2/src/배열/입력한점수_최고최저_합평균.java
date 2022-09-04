package 배열;

import java.util.Scanner;

public class 입력한점수_최고최저_합평균 {

	public static void main(String[] args) {
		//크기가 5인 정수형 배열 생성
		//정수형 배열에 5개의 점수 입력 후 저장하여 출력
		//입력한 점수 중 최고 점수와 최저 점수 출력
		//입력한 점수의 총합과 평균 출력
		
		Scanner sc=new Scanner(System.in);

		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+1+"번째 입력 >> ");
			arr[i]=sc.nextInt();
		}

		int max=arr[0];
		int min=arr[0];
		int sum=0;//총합
		
		System.out.print("입력된 점수: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			sum+=arr[i];
		}
		System.out.println();
		
		System.out.println("최고점수: "+max);
		System.out.println("최저점수: "+min);
		System.out.println("총합: "+sum);
		System.out.println("평균: "+(sum/(double)arr.length));

	}

}

package 배열;

import java.util.Arrays;
import java.util.Random;

public class 홀수_홀수개수 {

	public static void main(String[] args) {
		//크기가 10인 1차원 정수형 배열을 선언한 후 원하는 값으로 초기화
		//배열의 값 중 홀수만 출력, 몇 개인지 출력
		//배열 홀수: 5,13,27,35,3,1, 총개수:6개
		int[] arr= {5,6,13,27,34,35,78,2,3,1};
		
		int cnt=0;//홀수 개수 저장할 변수
		System.out.print("배열 홀수: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
				cnt++;
			}
		} 
		System.out.println();
		System.out.println("총 개수: "+cnt+"개");
		System.out.println();
		
		//배열 랜덤 값으로 초기화
		Random rd=new Random();
		int[] arr2=new int[10];
		
		cnt=0;
		System.out.print("배열 홀수: ");
		for(int i=0;i<arr.length;i++) {
			arr2[i]=rd.nextInt(10)+1;
			if(arr2[i]%2!=0) {
				System.out.print(arr2[i]+" ");
				cnt++;
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(arr2));
		System.out.println("총 개수: "+cnt+"개");

	}

}

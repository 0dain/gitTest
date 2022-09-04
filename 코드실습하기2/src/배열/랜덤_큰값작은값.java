package 배열;

import java.util.Arrays;
import java.util.Random;

public class 랜덤_큰값작은값 {

	public static void main(String[] args) {
		//크기가 10인 1차원 정수형 배열 선언 후 랜덤으로 값 초기화
		//배열의 값 중 가장 큰 값을 찾아 출력
		//배열의 값 중 가낭 작은 값을 찾아 출력
		
		Random rd=new Random();
		
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=rd.nextInt(10)+1;
		}
		
		int max=arr[0];//가장 큰 수 담을 변수
		int min=arr[0];//가장 작은 수 담을 변수
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("가장 큰 값: "+max);
		System.out.println("가장 작은 값: "+min);

	}

}

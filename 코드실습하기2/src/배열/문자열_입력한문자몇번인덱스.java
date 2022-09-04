package 배열;

import java.util.Scanner;

public class 문자열_입력한문자몇번인덱스 {

	public static void main(String[] args) {
		
		//크기가 8인 배열을 생성하고 이름으로 값을 초기화
		//프로그램 실행시 이름을 입력하고 해당 이름이 몇 번째 인덱스에 저장되어 있는지 출력
		
		Scanner sc=new Scanner(System.in);
		
		String[] arrst= {"임다인","엄마","혜인이","까꿍이","군밤이","지인이","승태","할머니"};
		System.out.print("검색할 이름 입력 >> ");
		String name=sc.next();
		
		for(int i=0;i<arrst.length;i++) {
			if(arrst[i].equals(name)) {
				System.out.println(name+"님은 "+i+"번째 인덱스에 저장되어 있습니다.");
				break;
			}
		}
		
	}

}

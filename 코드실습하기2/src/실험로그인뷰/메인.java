package 실험로그인뷰;

import java.util.Scanner;

import 미니프로젝트DB연습.캐릭터;
import 실험컨트롤러.컨트롤러;

public class 메인 {

	public static void main(String[] args) {
	//사용자에게 보여지는 화면들을 작성하는 구역
	Scanner sc=new Scanner(System.in);
				
	//Controller에게 접근하기 위한 객체 생성
	컨트롤러 con=new 컨트롤러();//import해주기, 다른 패키지에 있으니까~
				
		int result=0;
				
		while(true) {
			System.out.print("[1]회원가입 [2]로그인 [3]탈퇴 [4]종료 >> ");
			int menu=sc.nextInt();
			
			if(menu==1) {//회원가입
				//DB -> insert작업
				System.out.println("=====회원가입 기능=====");
				System.out.print("아이디: ");
				String id=sc.next();
				
				System.out.print("비밀번호: ");
				String pw=sc.next();
				
						
				result=con.conInsert(id, pw);
				//Controller -> MemberDAO -> id, pw, nick, age -> (DB) 회원가입
						
				if(result>0) {
					System.out.println("가입 성공");
				}else {
					System.out.println("가입 실패");
				}
			}else if(menu==2) {//로그인
				//DB-> select작업
				System.out.println("로그인 합니다.");
				System.out.print("아이디: ");
				String id=sc.next();
				System.out.print("비밀번호: ");
				String pw=sc.next();
				
				//로그인 성공 시 회원의 닉네임 출력
				String ID=con.conLogin(id, pw);
				if(ID!=null) {
					System.out.println("환영합니다~! "+ID+"님");
				}else {
					System.out.println("회원정보가 없습니다");
				}
				
				System.out.print("[1]캐릭터 신규 생성 [2]캐릭터 선택 [3]캐릭터 삭제 [4]이전 >> ");
				int login=sc.nextInt();
				
				if(login==1) {
					System.out.print("닉네임을 입력하세요: ");
					String nick=sc.next();
					System.out.print("캐릭터 종류를 선택하세요\n[ㄱ]춘식이 [ㄴ]라이언 [ㄷ]프로도 >> ");
					String charType=sc.next();
					if(charType.equals("ㄱ")) {
						charType="춘식이";
					}else if(charType.equals("ㄴ")) {
						charType="라이언";
					}else if(charType.equals("ㄷ")) {
						charType="프로도";
					}										
					캐릭터 ch=new 캐릭터(nick, charType);
					con.newChar();
				}
				
			}else if(menu==3) {//탈퇴
				//DB -> delete 작업
//				ArrayList<회원관리> re=new ArrayList<>();
				System.out.println("삭제할 아이디 입력: ");
				String id=sc.next();
				System.out.println("삭제되었습니다.");
				con.conDelete(id);
				
			}else if(menu==4) {//종료
				System.out.println("\n종료됩니다");
				break;
			}
					
		}//while문 닫음

	}

}

package 실험컨트롤러;

import java.util.ArrayList;

import 미니프로젝트DB연습.dbCon;
import 미니프로젝트DB연습.회원관리;

public class 컨트롤러 {
	
	//Controller역할을 진행하는 클래스
			//view <-> DAO(DB의 로직)
		
		dbCon dbc=new dbCon();
		
		int cnt=0;
		
		public int conInsert(String id, String pw) {
			//view가 넘겨준 회원가입에 대한 정보를 DAO로 연결해주는 메서드
			cnt=dbc.insert(id, pw);
			
			return cnt;
		}
		
//		public ArrayList<회원관리> conSelect() {
//			//회원정보 조회해서 탈퇴해야 함
//			ArrayList<회원관리> totalList=new ArrayList<>();
//			
//			totalList=dbc.select();
//			
//			return totalList;
//		}
		
		//로그인을 진행하기 위한 Controller 요청
		public String conLogin(String id, String pw) {
			
			String nick=dbc.login(id, pw);
			
			return nick;
		}
		
		//탈퇴
		public void conDelete(String id) {

			dbc.delete(id);
			
		}

	

}

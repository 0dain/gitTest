package 실험컨트롤러;

import 미니프로젝트DB연습.MemDAO;

public class 컨트롤러 {
	
	//Controller역할을 진행하는 클래스
			//view <-> DAO(DB의 로직)
		
		MemDAO dbc=new MemDAO();
		
		int cnt=0;
		
		public int conInsert(String id, String pw, String userNick) {
			//view가 넘겨준 회원가입에 대한 정보를 DAO로 연결해주는 메서드
			cnt=dbc.insert(id, pw, userNick);
			
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
			
			String ID=dbc.login(id, pw);
			
			return ID;
		}
		
		//탈퇴
		public void conDelete(String id, String pw) {

			dbc.delete(id, pw);
			
		}
		
		//캐릭터 생성
		public void newChar() {
//			dbc.Newchar();
		}

	

}

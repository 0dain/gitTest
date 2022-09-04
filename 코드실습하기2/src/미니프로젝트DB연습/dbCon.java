package 미니프로젝트DB연습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class dbCon {

	//객체 생성
	Connection conn=null;
	PreparedStatement psmt=null;
	ResultSet rs=null;
	
	//executeUpdate의 결과값을 담아주는 변수
	int cnt=0;
	
	//연결해주는 메서드
	public void getCon() {
		try {
			//1. Class.forName(): 드라이버에 연결에 필요한 클래스 찾아오기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 데이터베이스의 url, id, pw연결
			String url="jdbc:oracle:thin:@localhost:1521:xe"; //학원가서 우리조 DB주소로 변경하기
			String db_id="hr";//우리조 아이디로 변경하기
			String db_pw="hr";//우리조 비밀번호로 변경하기
			
			conn=DriverManager.getConnection(url, db_id, db_pw);//접속가능한지 확인
			
			if(conn==null) {
				System.out.println("접속 실패...");
			}
//			if(conn!=null) {
//				System.out.println("접속 성공!");
//			}else {
//				System.out.println("접속 실패..");
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	//사용된 객체를 닫아주는 메서드
	public void close() {
			try {
				if(rs!=null) {
				rs.close();
				} if(psmt!=null) {
					psmt.close();
				} if(conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	
	//[1]회원가입
	public int insert(String id, String pw) {
		getCon();//연결, 위에서 이미 try=catch로 확인을 하기 때문에 안 넣어줘도 됨
		
		try {
			String sql="insert into Minimember values(?,?)";//그냥 문장이기 때문에 try-catch에 넣어주지 않아도 됨
			psmt=conn.prepareStatement(sql);
			
			psmt.setString(1,id);
			psmt.setString(2,pw);
			
			cnt=psmt.executeUpdate();//sql문장 실행해달라는 명령어, 테이블의 값이 수정, 삭제될 때는 Update쓰기
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			close();
		}
		return cnt;
	}
	
	//[2]로그인	
	public String login(String id, String pw) {
		
		String nick=null;//결과값 리턴을 위한 변수
		
		getCon();//DB접속
		
		try {
			String sql="select mem_id from Minimember where mem_id=? and mem_pw=?";
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			rs=psmt.executeQuery();
			
			if(rs.next()) {//While문은 반복해서 데이터가 없을 때까지 모든 목록을 다 보여줌(물론 조건을 설정하면 하나만 보여주기도 가능함) if는 하나만 보여줌
				nick=rs.getString(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			close();
		}
		
		return nick;
	}
	
	//[2-1] 조회
//	public ArrayList<회원관리> select() {//ArrayList<MemberDTO> 리턴 타입 ArrayList를 쓸 땐 꺽새도 같이 적어야 함!!
//		//전체 회원의 정보를 담을 수 있는 ArrayList 만들기
//		ArrayList<회원관리> totalList=new ArrayList<>();//import해주기
//		
//		getCon();//DB접속
//
//		try {
//			String sql="select mem_id, mem_pw from Minimember";
//			psmt=conn.prepareStatement(sql);
//			
//			 rs=psmt.executeQuery();//sql문 실행해달라는 명령어 select는 Query임
//			 
//			 while(rs.next()) {//.next() rs 안에 데이터가 있는지 없는지 T/F타입으로 반환
//				String id=rs.getString("mem_id");//rs.getString(1) -> 첫 번째 열에 있는 데이터 가지고 오겠다! 헷갈리면 "id"로 적어도 됨
//				String pw=rs.getString("mem_pw");
//				
////				System.out.println(id+" / "+nick);
//				회원관리 dto=new 회원관리(id, pw);
//				totalList.add(dto);//확인된 데이터를 ArrayList배열에 저장해서 리턴해주기!
//				//한줄로 입력하고 싶을 때 -> totalList.add(new MemberDTO(id, nick));
//			 }
//			 
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		finally {
//			close();
//		}
//		return totalList;
//		
//	}
	
//	String id;
	//[3]탈퇴
	public int delete(String id) {
		
		int result=0;
		
		getCon();//DB접속

		try {
			String sql="delete from Minimember where mem_id='"+id+"'";
			psmt=conn.prepareStatement(sql);
//			String id=rs.getString("mem_id");
			
			 cnt=psmt.executeUpdate();//sql문 실행해달라는 명령어
			 
			 String sql1="select * from Minimember where mem_id='"+id+"'";
			 rs=psmt.executeQuery(sql1);
			 if(rs.next()==true) {
				 result=0; //실패
			 }else {
				 result=1;//성공
			 }
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return cnt;
		
	}
	
	
	
	
	


}

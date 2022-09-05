package 미니프로젝트DB연습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class 연습MemDAO {

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
			String url="jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; //학원가서 우리조 DB주소로 변경하기
			String db_id="campus_k_0803_2";//우리조 아이디로 변경하기
			String db_pw="smhrd2";//우리조 비밀번호로 변경하기
			
			conn=DriverManager.getConnection(url, db_id, db_pw);//접속가능한지 확인
			
			if(conn==null) {
				System.out.println("접속 실패...");
			} else
				System.out.println("접속 성공");
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
	public int insert(String id, String pw, String userNick) {
		getCon();//연결, 위에서 이미 try=catch로 확인을 하기 때문에 안 넣어줘도 됨
		
		try {
			String sql="insert into Minimember values(?,?,?)";//그냥 문장이기 때문에 try-catch에 넣어주지 않아도 됨
			psmt=conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, userNick);
			
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
		
		String userNick=null;//결과값 리턴을 위한 변수
		
		getCon();//DB접속
		
		try {
			String sql="select mem_id from Minimember where mem_id=? and mem_pw=?";
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			rs=psmt.executeQuery();
			
			if(rs.next()) {//While문은 반복해서 데이터가 없을 때까지 모든 목록을 다 보여줌(물론 조건을 설정하면 하나만 보여주기도 가능함) if는 하나만 보여줌
				userNick=rs.getString(3);//"user_nick"을 가져와라!
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			close();
		}
		
		return userNick;
	}
	
	//[3]탈퇴
	public int delete(String id, String pw) {
		
		cnt=0;
		
		getCon();//DB접속

		try {
			String sql="delete from Minimember where mem_id='"+id+"'";
			psmt=conn.prepareStatement(sql);
//			String id=rs.getString("mem_id");
			
			 cnt=psmt.executeUpdate();//sql문 실행해달라는 명령어
			 
			 String sql1="select * from Minimember where mem_id='"+id+"'";
			 rs=psmt.executeQuery(sql1);
			 if(rs.next()==true) {
				 cnt=0; //실패
			 }else {
				 cnt=1;//성공
			 }
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return cnt;
		
	}
	
	//신규 캐릭터 생성
//	
//	public void Newchar(CharDTO ch) {
//		
//		getCon();//연결, 위에서 이미 try=catch로 확인을 하기 때문에 안 넣어줘도 됨
//		
//		try {
////			CharDTO cha=new CharDTO();
//			String sql="insert into Minimember values(?,?,?,?,1,0,100,0)";//그냥 문장이기 때문에 try-catch에 넣어주지 않아도 됨
//			psmt=conn.prepareStatement(sql);
//			
//			psmt.setString(1,ch.getNick());
//			psmt.setString(2,ch.getmemID());
//			psmt.setString(3,ch.getcharType());
//			psmt.setInt(4,ch.getWork_ability());
//			
//			cnt=psmt.executeUpdate();//sql문장 실행해달라는 명령어, 테이블의 값이 수정, 삭제될 때는 Update쓰기
//			
//			if(cnt>0) {
//				
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		finally {
//			close();
//		}
//		
//	}

	//
	
	
	
	
	
	
	


}

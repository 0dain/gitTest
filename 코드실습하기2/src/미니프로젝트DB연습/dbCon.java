package 미니프로젝트DB연습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbCon {

	//객체 생성
	Connection conn=null;
	PreparedStatement psmt=null;
	ResultSet rs=null;
	
	
	//연결
	public void getCon() {
		try {
			//1. Class.forName(): 드라이버에 연결에 필요한 클래스 찾아오기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 데이터베이스의 url, id, pw연결
			String url="jdbc:oracle:thin:@localhost:1521:xe"; //학원가서 우리조 DB주소로 변경하기
			String db_id="hr";//우리조 아이디로 변경하기
			String db_pw="hr";//우리조 비밀번호로 변경하기
			
			conn=DriverManager.getConnection(url, db_id, db_pw);//접속가능한지 확인
			
			if(conn!=null) {
				System.out.println("접속 성공!");
			}else {
				System.out.println("접속 실패..");
			}
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
	
	
	
	
	
	//회원정보 테이블(id(PK), pw(nn))
	
	
	
	
	//캐릭터(닉네임(PK), 캐릭터 종류, 레벨, 에너지(체력), 업무숙련도(공격력), 아이디(FK-회원정보 ID), 인지도(경험치), 스트레스, 최종접속날짜????, 
	//활동(check 제약조건, 전투(업무-서류,미팅,워크샵), 힐링(넷플릭스, 드라이브, 월루))

	
	
	
	
}

package 미니프로젝트DB연습;

public class MemDTO {
	
	//Model -> VO(Value Object)-> DTO(Date Transfer Object)
	
	//회원관리를 위한 설계도
	//아이디, 비밀번호
		
	private String id;
	private String pw;
	private String nick;//닉네임
		
	//이 설계도랑 연결될 수 있는 데이터베이스 클래스가 있어야 함
		
	//id
	//id, pw
	//id, nick
	//id,pw,nick
		
	//이렇게 묶어서 각각의 생성자를 만들 수 있음!

	//Select 기능 사용 시 ArrayList에 담을 id, nick을 하나의 생성자로 만들기
	public MemDTO(String id, String pw) {
		this.id=id;
		this.nick=pw;
	}
		

	//변수가 private으로 잠겨 있을 때 get메서드 사용
	public String getId() {
		return id;
	}
		
	public String getNick() {
		return nick;
	}
	
	public String getPw() {
		return pw;
	}

}

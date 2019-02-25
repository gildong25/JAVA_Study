/**
 * 회원 관리 기능
 * */
public interface MemberDao {
	/**
	 * 회원 가입을 처리한다.
	 * */
	public void doJoin();
	/**
	 * 로그인을 수행한다.
	 * */
	public void doLogin();
	/**
	 * 회원 정보를 수정한다.
	 * */
	public void doUpdate();
	/**
	 * 회원 정보를 조회한다.
	 * */
	public void getInfo();
	/**
	 * 로그아웃
	 * */
	public void doLogout();
	
	
}
// 주석에도 문법이 있다!!!!!!!@@!@!@!@!@
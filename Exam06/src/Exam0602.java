/**
 * 
 * 문제에서 제시하는 내용을 작성하여 에러를 수정해야 합니다.
 * 단, 기본으로 제시되는 소스코드는 수정할 수 없습니다.
 * 
 * [06일차 연습문제 02]
 *------------------------------------------------
 * MemberDao 인터페이스는 회원가입,로그인,정보수정,정보조회,로그아웃의 
 * 기능을 정의하고 있다.
 * 
 * 다음의 클래스가 정상적으로 동작할 수 있도록
 * MemberDao 인터페이스와 MemberDaoImpl 클래스를 작성하시오.
 *
 *(구현체) mpl
 *
 * [실행결과 예시]
 *------------------------------------------------
 *  가입이 완료되었습니다.
 *  로그인 되셨습니다.
 *  회원 정보가 수정되었습니다.
 *  회원 정보를 수정합니다.
 *  로그아웃 되셨습니다.
 */
public class Exam0602 {
	public static void main(String[] args) {
		MemberDao member = new MemberDaoImpl();
/**Data Access Object 
 * 31가지 설계 패턴, 
 * 	* SingleTon 패턴 
 *  * Dao 패턴 
 *  -------------
 *  Service 패턴
 *  MVC패턴 -> JSP Model2*/		
		member.doJoin();
		member.doLogin();
		member.doUpdate();
		member.getInfo();
		member.doLogout();
	}
}

/**
 * [08일차 연습문제 01]
 *--------------------------------------
 * 다음의 프로그램은 now_year 변수에 현재 년도에 해당하는 값을,
 * jumin 변수에 사용자가 입력한 문자열을 저장하여 출력한다.
 * 
 * 1) 사용자가 입력한 값이 주민번호 형식에 맞지 않을 경우 
 *    "주민번호가 형식에 맞지 않습니다." 라는 내용을 출력하고,
 *    프로그램을 종료하시오.
 *    (RegexHelper 클래스를 활용하여 구현)
 *    
 * 2) 입력한 주민번호를 기반으로 하여 사용자의 나이를 계산하여 출력하시오.
 * 
 * 
 * [실행결과 예시]
 *--------------------------------------
 * - 주민번호 형식에 맞지 않을 경우.
 * 		년도: 2015 / 입력값: 
 *		주민번호가 형식에 맞지 않습니다.
 *
 * - 주민번호 형식에 맞는 경우.
 * 		년도: 2015 / 입력값: 9012341000123
 *		당신은 26살 입니다.
 */

import java.util.Calendar;
import javax.swing.JOptionPane;

public class Exam0801 {
	public static void main(String[] args) {
		// 현재 년도
		int now_year = Calendar.getInstance().get(Calendar.YEAR);
				
		// 다이얼로그에서 입력값 받기
		String jumin = JOptionPane.showInputDialog("당신의 주민번호를 '-' 없이 입력해 주세요.");
		
		// 값 출력하기
		System.out.println("년도: " + now_year + " / 입력값: " + jumin);
		
		
		
	}
}

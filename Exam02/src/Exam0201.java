/**
 * [02일차 문제 01] ------------------------------------------------- 1) double형 변수를
 * 다음과 같이 준비합니다.
 * 
 * // 자신의 키 double myHeight = 직접입력하세요; // 자신의 몸무게 double myWeight = 직접입력하세요; //
 * 표준체중 double standardWeight = 0; // 비만도 double obesity = 0;
 * 
 * 
 * 2) 표준 체중 standardWeight를 다음의 공식으로 구하세요.
 * 
 * 표준체중(키 150이하) = 신장cm - 110 표준체중(키 151이상) = (신장cm - 110) x 0.9
 * 
 * 
 * 3) 비만도 값 obesity를 다음의 공식으로 구하세요.
 * 
 * (현재 몸무게 - 표준체중) --------------------------- x 100 = 비만도(%) 표준체중
 * obesity=(myWeight - strandardWeight)*100
 * 
 * 4) 다음의 범위에 따라서 비만도 측정치를 if문을 사용해서 출력하세요.
 * 
 * 20% 이하 - 정상(안심) 20% 초과, 30% 이하 - 경도비만(주의) 30% 초과, 50% 이하 - 중등도 비만(위험) 50% 초과
 * - 고도비만(매우위험)
 * 
 * 
 * [출력결과 예시] --> 다음의 네 가지 경우 중 하나로 출력되어야 합니다.
 * -------------------------------------------------- 정상. 안심하세요. 경도비만. 주의하세요.
 * 중등도 비만!! 위험합니다. 고도비만!! 매우 위험합니다.
 */
public class Exam0201 {
	public static void main(String[] args) {
		double myHeight = 200;

		double myWeight = 100;

		double standardWeight = 0;

		double obesity = 0;
		
		if (myHeight <= 150) {
			standardWeight = myHeight - 110;
		} else {
			standardWeight = (myHeight - 110) * 0.9;
		}
		
		obesity = (myWeight - standardWeight) / standardWeight * 100;
		
		if (obesity <= 20) {
			System.out.println("정상. 안심하세요.");
		} else if (obesity > 20 && obesity <= 30) {
			System.out.println("경도비만. 주의하세요.");
		} else if (obesity > 30 && obesity <= 50) {
			System.out.println("중등도 비만!! 위험합니다.");
		} else {
			System.out.println("고도비만!! 매우 위험합니다.");
		}

	}
}

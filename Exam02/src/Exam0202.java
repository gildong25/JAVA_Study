/**
 * [02일차 문제 02]
 *-------------------------------------------------
 * 이중 반복문을 사용하여 다음의 결과를 출력해 보시오.
 * 
 * - 다음의 메서드를 사용하세요.
 *  	System.out.print(내용) --> 출력후 줄바꿈 하지 않음
 * 		System.out.println() --> 출력하는 내용 없이 줄바꿈만 수행함
 * 
 * 
 * [출력결과 예시] --> 별(*)이 라인마다 하나씩 증가하면서 총 10줄이 출력됩니다.
 *--------------------------------------------------
 * 	*
 *	**
 *	***
 *	****
 *	*****
 *	******
 *	*******
 *	********
 *	*********
 *	**********
 */
public class Exam0202 {
	public static void main(String[] args) {
		for (int i=0; i<10; i++){ //행
			for (int j=0; j<i; j++){ //열
				System.out.print("*");
			}
			System.out.println();
		}
	}
	}

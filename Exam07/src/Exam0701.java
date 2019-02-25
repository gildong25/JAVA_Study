/**
 * [07일차 연습문제 01]
 *-----------------------------------------
 * 다음의 프로그램이 구구단 2단부터 9단까지 출력할 수 있도록
 * MyMathHelper 클래스를 작성하시오.
 * 
 * 
 * [실행 결과]
 *-----------------------------------------
 *	2 x 1 = 2
 *	2 x 2 = 4
 *	2 x 3 = 6
 *	2 x 4 = 8
 *	2 x 5 = 10
 *	2 x 6 = 12
 *	2 x 7 = 14
 *	2 x 8 = 16
 *	2 x 9 = 18
 *	----------------
 *	3 x 1 = 3
 *	3 x 2 = 6
 *	3 x 3 = 9
 *	3 x 4 = 12
 *	... 생략 ...
 */

import study.java.helper.MyMathHelper;

public class Exam0701 {
	public static void main(String[] args) {
		for (int i=2; i<10; i++) {
			MyMathHelper.getInstance().gugu(i);
			
			if (i+1<10) {
				System.out.println("----------------");
			}
		}
	}
}

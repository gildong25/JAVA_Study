/**
 * [03일차 문제 01] ------------------------------------------------- 1부터 100까지의 자연수
 * 중에서 3의 배수이면서 동시에 5의 배수인 숫자를 출력하여보자.
 * 
 * [출력결과 예시] -------------------------------------------------- 15 30 45 60 75
 * 90
 */
public class Exam0301 {
	public static void main(String[] args) {
		int num1;

		for (num1 = 1; num1 <= 100; num1++) {
			// if(num1 % 3==0) {continue;}
			if (num1 % 5 == 0 && num1 % 3 == 0) {
				System.out.println(num1);
		/*for (int i=1; i <=100; i++){
		 * 	if (i%3== 0 && i % 5 == 0){
		 * 			System.out.println(i);
		 * 	}
		 * }
		 *  
		 * */
				
			}

		}

	}
}

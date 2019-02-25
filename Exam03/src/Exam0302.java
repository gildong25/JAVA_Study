/**
 * [03일차 문제 02]
 * (주의) 제시되는 기본 코드는 삭제,수정 없이 진행하세요.
 *-------------------------------------------------
 * 1) 다음과 같이 1차 배열을 정의하세요.
 * 
 *    int[] arr = { 1, 9, 4, 2, 5 };
 *    
 *    
 * 2) arr과 사이즈가 동일한 copy라는 이름의 배열을 생성하고,
 *    arr의 각 칸에 저장되어 있는 값들 copy 배열에 복사하세요.
 *    (반복문을 사용해야 합니다.)
 *    
 * 
 * 3) 복사된 결과를 확인하기 위하여 copy 배열의 모든 내용을 출력하세요.
 * 
 * 
 * [출력결과 예시]
 *--------------------------------------------------
 * copy[0]=1
 * copy[1]=9
 * copy[2]=4
 * copy[3]=2
 * copy[4]=5
 */
public class Exam0302 {
	public static void main(String[] args) {
		// 문제 출제를 위한 배열
		int[] arr = { 1, 9, 4, 2, 5 };

		 int[] copy = new int[arr.length];
		 for (int i = 0; i < arr.length; i++){
		 		copy[i] = arr[i];
		 	}
		  for (int i = 0; i < arr.length; i++){
		 		System.out.println("copy["+ i + "]=" + copy[i]);
		 	}	

	
		/* 
		 arr의 사이즈와 동일한 크기를 갖는 배열.
		 int[] copy = new int[arr.length];
		 for (int i= 0; i < arr.length; i++){
		 		copy[i] = arr[i];
		 	}
		  for (int i = 0; i < arr.length; i++){
		 		System.out.println("copy["+ i + "]=" + copy[i]);
		 	}	
		 *int i;
		int j=0;

		for (i=1;i<=5;i++){
			j = arr[i];
		
			j++;
			System.out.println("copy["+i+"]="+j);
		}
*/
		/* 변수 복사의 경우와 배열의 복사의 경우가 다른 이유는
		 * 배열을 대입하여 붙여넣었을 경우 원본이 변경 되었을때
		 * (통으로)복사한 배열의 내용까지 함께 바뀌게 된다.		 * 
		 * 복사가 아닌 참조가 되어버림.
		 * 복사 / 참조 이런식!@!@!@!@ 
		 * 
		 * 
		 * */
		
		
		
	}
}

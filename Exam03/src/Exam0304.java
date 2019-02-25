/**
 * [03일차 문제 04]
 * (주의) 제시되는 기본 코드는 삭제,수정 없이 진행하세요.
 *-------------------------------------------------
 * 1) 다음과 같이 1차 배열을 두 개 정의하세요.
 * 
 *    int[] arr1 = { 1, 9, 4, 2, 5 };
 *    int[] arr2 = { 5, 8, 6, 3, 1 };
 *    
 *    
 * 2) 두 개의 배열을 파라미터로 전달받아서 일치하는 데이터의 수를 리턴하는
 *    compareArray() 메서드를 완성하세요.
 *    
 *    --> main() 메서드의 소스코드는 수정할 필요 없습니다.
 * 
 * 
 * [출력결과 예시]
 *--------------------------------------------------
 * 일치하는 데이터는 총 2개 입니다.
 */

/*public class Exam0304 {
	public static void main(String[] args) {
		// 문제에서 제시한 배열 정의
		int[] arr1 = { 1, 9, 4, 2, 5 };
		int[] arr2 = { 5, 8, 6, 3, 1 };

		// copareArray() 메서드의 리턴값을 출력한다.
		// --> 이 부분의 에러를 해결하기 위해서 어떻게 해야 할까요?
		System.out.println("일치하는 데이터는 총 " 
					+ compareArray(arr1, arr2) + "개 입니다.");
	}
	
	
}
*/
public class Exam0304 {
	public static void main(String[] args) {
		// 문제에서 제시한 배열 정의
		int[] arr1 = { 1, 9, 4, 2, 5 };
		int[] arr2 = { 5, 8, 6, 3, 1 };

		// copareArray() 메서드의 리턴값을 출력한다.
		// --> 이 부분의 에러를 해결하기 위해서 어떻게 해야 할까요?
		System.out.println("일치하는 데이터는 총 " 
					+ compareArray(arr1, arr2) + "개 입니다.");
	}
	
	public static int compareArray(int[]arr1, int[] arr2){
		
		int count = 0; //일치하는 데이터의 수
		
		
		// 바깥의 반복문으로 arr1을 훑어 본다.
		for(int i = 0; i<arr1.length; i++){
			//안쪽의 반복문으로 arr2를 훑어본다.
			for (int j = 0; j<arr2.length; j++){
				if(arr1[i] == arr2[j]){
					//개수를 1 증가
					count ++;
				}
			}
		}
		return count;
	}
}

public class Main04 {

	public static void main(String[] args) {
		int [] arr = new int[3];
		
		try{
			
		
			for (int i = 0; i <5 ; i ++){
			
				arr[i] = i;// i가 3일때 에러발생
			
			System.out.println(arr[i]);
			}
	} catch (ArrayIndexOutOfBoundsException e){
		System.out.println("에러발생");
		System.out.println("원인 : " + e.getMessage());
		}
	System.out.println("프로그램종료");
	}

}

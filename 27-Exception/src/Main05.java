
public class Main05 {

	public static void main(String[] args) {

		// 사용자의 입력값을 가정
		String[] src = {"가", "2", "aaa", "ccc"};
		
		//src 의 내용들을 숫자로 변환해서 저장할 배열
		int [] arr = new int[3];
		try{
		for (int i = 0; i < src.length; i++){
			arr[i] = Integer.parseInt(src[i]);
			System.out.println(arr[i]);
		}
		} catch(NumberFormatException e){
			
		}catch(ArrayIndexOutOfBoundsException e){
			
		}catch(Exception e){
			
		}finally{
		
System.out.println("프로그램을 종료합니다.");
	}

}
}

package study.java.helper;

public class Main04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** 5 자리의 인증번호 생성하기 */
		String authNum = "";
		
		for (int i = 0 ; i < 5; i ++){
			authNum += Util.getInstance().random(0, 9);
		}
	
	System.out.println("인증번호="+authNum);
	
	}

}

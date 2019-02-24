class Book{
	String subject;
	String content;
	
	Book(){
		System.out.println("--- 생성자 실행됨 ----");
		this.subject = "JAVA입문";
		this.content = "JAVA는 어쩌구 저쩌구";
	}
	
	void read() {
		System.out.println("--- read() 실행됨 -----");
		System.out.println(this.subject);
		System.out.println(this.content);
	}
}
public class Main06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.read();
	}

}

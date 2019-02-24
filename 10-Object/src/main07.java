class Article{
	int seq;
	String subject;
	String writer;
	
	public Article(int seq, String subject, String writer){
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	public void print(){
		System.out.println(this.seq);
		System.out.println(this.subject);
		System.out.println(this.writer);
	}

}
public class main07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Article article1 = new Article(1, "자바연습 첫 번째 입니다.", "자바학생");
		
		article1.print();
		
		System.out.println("---------------");
		
		Article article2 = new Article(2, " 자바는 객체지향 언어입니다.", "자바강사");
		
		article2.print();

	}

}

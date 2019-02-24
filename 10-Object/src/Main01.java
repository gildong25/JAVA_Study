class Student{
	String name = "자바학생";
	int age = 19;
}

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std;
		std = new Student();
		
		
		System.out.println("이름: "+ std.name);
		System.out.println("나이: "+ std.age);
	}

}

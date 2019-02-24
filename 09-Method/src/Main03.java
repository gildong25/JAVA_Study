
public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = f1(100);
		System.out.println(a);
		System.out.println(f2(10));
	}	
	public static int f1(int x){
		int y = x + 1;
		return y;
	}
	public static int f2(int x) {
		return x*x +1;
	}
}

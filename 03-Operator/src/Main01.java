
public class Main01 {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 8;

		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1 * num2;
		int result4 = num1 / num2;
		int result5 = num1 % num2;

		System.out.println("12 + 8 = " + result1);
		System.out.println("12 - 8 = " + result2);
		System.out.println("12 * 8 = " + result3);
		System.out.println("12 / 8 = " + result4);
		System.out.println("12 % 8 = " + result5);

		int a = 7;
		int b = 3;
		int result = a / b;
		System.out.println("7 / 3 = " + result);

		double c = 7.0d;
		double d = 3.0d;
		double result01 = c / d;
		System.out.println("7.0 / 3.0 = " + result01);
		double result02 = c/b;
		System.out.println("7.0 / 3 = "+result02);
		
		System.out.println("5 % 2 = " + 5 % 2);
		System.out.println("5.2d % 2.0d = " + 5.2d % 2.0d);
	}

}

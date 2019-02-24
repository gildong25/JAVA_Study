
public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dooly;
		dooly = new int[3];
		dooly[0] = 75;
		dooly[1]=82;
		dooly[2]=91;
		
		int[] douneo = new int[3];
		douneo[0] = 88;
		douneo[1] = 64;
		douneo[2] = 50;
		
		int[] ddochy = new int[] {100, 100, 90};
		int sum1 = 0, sum2 = 0, sum3 = 0;
		
		for(int i = 0; i<dooly.length; i++){
			sum1 += dooly[i];
		}
		for(int i = 0; i<douneo.length; i++){
			sum2 += douneo[i];
		}
		for(int i = 0; i<ddochy.length; i++){
			sum3 += ddochy[i];
		}
		System.out.println(sum1 / dooly.length);
		System.out.println(sum2 / douneo.length);
		System.out.println(sum3 / ddochy.length);
		}

}


public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grade = new int[3][3];
		
		grade[0][0] = 75;
		grade[0][1] = 81;
		grade[0][2] = 91;
		
		grade[1][0] = 88;
		grade[1][1] = 64;
		grade[1][2] = 50;
		
		grade[2][0] = 100;
		grade[2][1] = 100;
		grade[2][2] = 90;
		
		for (int i = 0; i <grade.length; i++){
			int sum = 0;
			int avg = 0;
			
			for (int j = 0; j<grade[i].length;j++){
				sum+=grade[i][j];
			}
			
			avg = sum / grade[i].length;
			
			System.out.println("총점="+sum+", 평균="+avg);
		}
	}

}

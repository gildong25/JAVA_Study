			
public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Charactor c = new Charactor();
		System.out.println(c.toString());
		
		c.setProperty(19);
		System.out.println(c.toString());
	
		c.setProperty("회사원");
		System.out.println(c.toString());
	
		c.setProperty("자영업", 20);
		System.out.println(c.toString());
		
		c.setProperty(30, "교수");
		System.out.println(c.toString());
	
	}

}

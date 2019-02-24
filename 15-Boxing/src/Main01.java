
public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirForce af = new AirForce("공군");
		Navy nv = new Navy("해군");
		Army am = new Army("육군");

		af.bombing();
		nv.nucleus();
		am.tank();
		
		System.out.println("--------------");
		
		// 모든 객체는 자신의 상위 형태로 암묵적 형변환 가능
		Unit temp1 = af;
		Unit temp2 = nv;
		Unit temp3 = am;
		
		
		//형변환 되더라도 상속 받거나 재 정의한 (Override)
		//자신들의 기본 특성들은 그대로 유지함
		temp1.attack();
		temp2.attack();
		temp3.attack();
		
		System.out.println("-----------");
		
		//상위 클래스 형태로 형 변환이 되면, 자신의 독립 기능은
		//사용하지 못함.
		
		
		// 다시 원래의 기능을 되돌리기 위해서는 
		// 하위 클래스 형태로 명시적 형변환이 필요함
		AirForce re1 = (AirForce) temp1;
		Navy re2 = (Navy) temp2;
		Army re3 = (Army) temp3;
		
		re1.bombing();
		re2.nucleus();
		re3.tank();
		
	}

}

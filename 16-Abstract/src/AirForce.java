
public class AirForce extends Unit {

	public AirForce(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+ " >> 공중공격");

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+ " >> 공중이동");

	}

}

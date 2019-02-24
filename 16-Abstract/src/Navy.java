
public class Navy extends Unit {

	public Navy(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+ " >> 해상공격");

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+ " >> 해상이동");

	}

}

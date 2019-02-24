
public class Monster implements Fight, Move{
	private String name;
	
	public Monster(String name){
		this.name = name;
	}

	@Override
	public void walk() {
		System.out.println(this.name + " >> " + "걷습니다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " >> " + "뜁니다.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " >> " + "점프를 합니다.");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " >> " + "공격했습니다.");
	}

	@Override
	public void shield() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " >> " + "방어했습니다.");

	}
}

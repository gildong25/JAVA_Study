public class SportCar extends Car {
	public SportCar(int speed) {
		super(speed);
	}
// Car 라는 클래스는 int 형을 전달 받는 생성자를 포함해야한다.
	// 현재 클래스에 없는 메서드를 this로 접근한다는 것은 상위 클래스에서 상속받는 기능을 활용한다는 것을 의미.
	// getter, setter 형태의 메서드 이므로 메서드 이름에 대응되는 멤버변수가 존재할 것이다.
	
	@Override
	public void speedUp() {
		int speed = this.getSpeed();
		speed += 10;
		this.setSpeed(speed);
	}
}
/*문제 내용이나 제시되는 코드만으로는 상위 클래스가 speedUp 을 갖고 있다는 점은 알 수 있지만 그
 * 기능까지 는 유추 할수 없다. 
 * * 상위 기능 을 활용하지 않고 재정의만 하는 경우는 추상화기능? 뀨
 * */

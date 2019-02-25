/**
 * 
 * 문제에서 제시하는 내용을 작성하여 에러를 수정해야 합니다.
 * 단, 기본으로 제시되는 소스코드는 수정할 수 없습니다. 
 * 
 * [06일차 연습문제 01]
 *-------------------------------------------
 * 다음의 프로그램은 시속 40km로 달리고 있는 트럭이 있을 때,
 * 트럭이 초당 5km씩 속도가 증가하고 스포츠 카가 초당 10km씩 속도가 증가한다면,
 * 스포츠카가 시속 0km에서 출발해서 트럭보다 속도가 빨라지는데
 * 몇 초가 걸리는지 계산하는 프로그램이다.
 * 
 * 추상 클래스 Car를 상속받는 SportCar와 Truck 클래스가 있을 때,
 * 각 클래스의 내용을 분석하여 추상 클래스 Car를 작성하시오.
 *
 *
 * [실행결과 예시]
 *-------------------------------------------
 * 스포츠카가 트럭보다 빨라지는데 걸리는 시간은 8초이고 시속 80km 입니다.
 */
public class Exam0601 {
	public static void main(String[] args) {
		Car sport = new SportCar(0);
		Car truck = new Truck(40);
	// Car 클래스가 필요한 상태! - 생성 해야함 , Car 과 sport = 부모자식관계. 암묵적 형변환이 가능
		/*Car sport = new SportCar(0);
		Car truck = new Truck(40);*/
		int scar_speed = sport.getSpeed();
		int truck_speed = truck.getSpeed();
		int second = 0;
	// Speed라는 int 형 멤버 변수가 있다. SetSpeed 라는 메서드가 있을지도 모른다.
		/*int scar_speed = sport.getSpeed();
		int truck_speed = truck.getSpeed();
		int second = 0;*/
		
		// 트럭의 속도가 스포츠카의 속도보다 작은 동안 반복한다.
		while (truck_speed > scar_speed) {
			// 반복문 1회당 1초씩 증가한다고 가정.
			second++;
			
			// 스포츠카는 초당 10km씩 증가
			sport.speedUp();
			
			// 트럭은 초당 5km씩 증가
			truck.speedUp();
			
			// 증가된 속도를 비교식에 활용하기 위하여 조회한다.
			scar_speed = sport.getSpeed();
			truck_speed = truck.getSpeed();
		}
		
		System.out.printf("스포츠카가 트럭보다 빨라지는데 걸리는 시간은 "
				+ "%d초이고 시속 %dkm 입니다.", second, sport.getSpeed());
	}
}

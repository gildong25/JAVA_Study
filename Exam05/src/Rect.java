public class Rect extends Shape {
	/**
	 * 생성자
	 * @param width 	- 가로길이
	 * @param height 	- 세로길이
	 */

	public Rect(int width, int height) {
		super(width, height);

	}
	
	/**
	 * 면적을 구해서 리턴한다.
	 */
	@Override
	public int getArea() {
		int x = this.getWidth();
		int y = this.getHeight();
		int z = x * y;
		return z;
	}

	/**
	 * 둘레의 길이를 구해서 리턴한다.
	 */
	@Override
	public int getRound() {
		int x = this.getWidth();
		int y = this.getHeight();
		int z = (x * 2) + (y * 2);
		return z;
	}
	public int getArea(int width, int height){
		// 상위 클래스의 변수는 은닉되어 있으므로 setter로 접근
		//this.width = width;
		super.setWidth(width);
		super.setHeight(height);
		
		return getArea();
	}
	
	public int getRound(int width, int height){
		super.setWidth(width);
		super.setHeight(height);
		
		return getRound();
	}
}

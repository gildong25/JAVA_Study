
public class Square {
	private int width, height;

	public Square(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return this.width * this.height;
	}

	public int getRound() {
		return (this.width * 2) + (this.height * 2);
	}
}

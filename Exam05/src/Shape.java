
public abstract class Shape {
	private int width;
	private int height;
	
	public Shape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public abstract int getArea();
	public abstract int getRound();

	@Override
	public String toString() {
		return "Shape [width=" + width + ", height=" + height + "]";
	}
	
	
}


public class ShapesImpl implements Shapes {

	private int x;
	private int y;
	
	public ShapesImpl(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int calculateArea() {
		return x * y;
	}
	
	
}

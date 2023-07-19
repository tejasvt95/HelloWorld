
public class circle  extends shape{
	private double radius;
	public circle (double radius) {
		this.radius=radius;
	}
	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	@Override
	public double getarea() {
		return Math.PI*radius*radius;
	}

}

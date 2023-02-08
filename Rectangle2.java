
public class Rectangle2 extends Shape2{
	
	private double width;
	private double length;

	public Rectangle2(double width,double length,String color) {
		super();
		this.width  = width;
		this.length = length;
		color = "blue";
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getArea() {
		return width*length;
	}
	
	@Override
	public String toString() {
		return "Rectangle[width="+width+",length="+length+","+super.toString()+"]";
	}

}

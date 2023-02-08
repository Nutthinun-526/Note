//import 
abstract public class Shape {

	private String color;
	
	
	public Shape (String color) {
		this.color = color;
	}
	
	public Shape() {
		color = "";
	}

	
	abstract public double getArea();
	
	@Override
	public  String toString() {
		return "color="+color;
	}
}

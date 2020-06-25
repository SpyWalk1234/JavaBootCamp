package sef.module6.activity;

public class AbstractionActivity {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setColor("GREEN");
		r.setLength(5);
		r.setBreadth(5);
		
		System.out.println(String.format("Length: %s", r.getLength()));
		System.out.println(String.format("Breadth: %s", r.getBreadth()));
		System.out.println(String.format("Color: %s", r.getColor()));
		System.out.println(String.format("Area: %s", r.calculateArea()));
		System.out.println(String.format("Perimeter: %s", r.calculatePerimeter()));
		System.out.println("------------------------------------------------------------------------------------");
		
		r.setLength(5);
		r.setBreadth(6);
		System.out.println(String.format("Length: %s", r.getLength()));
		System.out.println(String.format("Breadth: %s", r.getBreadth()));
		System.out.println(String.format("Color: %s", r.getColor()));
		System.out.println(String.format("Area: %s", r.calculateArea()));
		System.out.println(String.format("Perimeter: %s", r.calculatePerimeter()));
	}
}

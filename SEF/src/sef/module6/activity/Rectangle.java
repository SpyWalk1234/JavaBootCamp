package sef.module6.activity;

public class Rectangle extends Shape {
	private double length;
	private double breadth;
	
	public Rectangle() {
		length = 0;
		breadth = 0;
	}
	
	@Override
	public double calculateArea() {
		return length * breadth;
	}

	@Override
	public double calculatePerimeter() {
		return length * 2 + breadth * 2;
	}
	
	public void setLength(double length) {
		this.length = length;
	}

	public double getLength() {
		return length;
	}
	
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double getBreadth() {
		return breadth;
	}
}

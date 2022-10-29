package Git;


public class TestShape {
	public static void main(String[] args) {
		Shape [] shape = new Shape[2];
		shape[ 0 ]  = new Circle("원",10);
		shape[ 1 ] = new Rectangular("직사각형",10,20);
		
		for (int i = 0; i < shape.length; i++) {
			shape[ i ].calculationArea();
			shape[ i ].print();
		}
	}
}



abstract class Shape{
	//매개변수
	protected double area;
	private String name;
	//생성자
	public void Shape() {
		
	}
	
	public Shape(String name) {
		super();
		this.name = name;
	}

	public Shape(double area, String name) {
		super();
		this.area = area;
		this.name = name;
	}
	
	//메서드
	abstract public void calculationArea();
	public void print() {
		System.out.println(name + "의 면적은 " + area);
	}
}

class Circle extends Shape{
	//매개변수
	private double radius;
	//생성자

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	public void calculationArea() {
		area = radius*radius * Math.PI;
	}
	
	
}

class Rectangular extends Shape{
	//매개변수
	private double width;
	private double height;
	//생성자
	public Rectangular(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	public void calculationArea() {
		area = width * height;
	}
	
}
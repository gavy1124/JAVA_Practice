package Git;

public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "시간후");
			dog.run(i);
			chicken.run(i);
		if (cheatableChicken instanceof Chicken) {
			cheatableChicken.fly();
			System.out.println();
			}
		}
	}
}

abstract class Animal {
	// 매개변수
	private int speed;
	private double distance;

	// 생성자
	public Animal() {
	}

	public Animal(int speed) {
		super();
		this.speed = speed;
	}

	public Animal(int speed, double distance) {
		super();
		this.speed = speed;
		this.distance = distance;
	}

	// 게터세터
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	// 메소드
	abstract public void run(int hour);
}

class Dog extends Animal {
	// 생성자(오버로딩)
	Dog(int speed) {
		super(speed);
	}

	// 메소드 (오버라이딩)
	@Override
	public void run(int hour) {
		// TODO Auto-generated method stub
		setDistance(getSpeed() * 0.5 + getDistance());
		
		
		System.out.println("개의 이동거리 : " + getDistance());
	}

}

class Chicken extends Animal implements Cheatable {
	// 생성자(오버로딩)
	Chicken(int speed) {
		super(speed);
	}

	// 메소드 (오버라이딩)
	@Override
	public void run(int hour) {
		
		// TODO Auto-generated method stub
		setDistance(getSpeed() * 1 + getDistance());
		
		
		System.out.println("닭의 이동거리 : " + getDistance());
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		setDistance(getSpeed() * 1);
		setDistance(getDistance());
		
		
		System.out.println("날으는 닭의 이동거리 : " + getDistance());
		setSpeed(getSpeed() * 2);

	}

}

interface Cheatable {
	public void fly();
}

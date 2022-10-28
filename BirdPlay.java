package Git;

public class BirdPlay {
 	public static void main(String s[]){
		Duck duck = new Duck();
		duck.setName("꽥꽥이");
		duck.fly();
		duck.sing();
		System.out.println(duck.toString());
		
	Sparrow sparrow = new Sparrow();
	sparrow.setName("짹짹");
	sparrow.fly();
	sparrow.sing();
	System.out.println(sparrow.toString());
	
		
	}
}

class Duck{
	public void fly() {
		System.out.println("오리(" + name + ")는 날지 않습니다.");
	}
	public void sing() {
		System.out.println("오리(" + name + ")가 소리내어 웁니다.");
	}
	public String toString() {
		return "오리의 이름은 꽥꽥이 입니다.";
	}
	
	
	private String name;
	private int legs;
	public Duck() {
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public Duck(String name, int legs) {
		super();
		this.name = name;
		this.legs = legs;
	}

	
	
	
}
class Sparrow{
	public void fly() {
		System.out.println("참새(" + name + ")는 날아다닙니다.");
	}
	public void sing() {
		System.out.println("참새(" + name + ")가 소리내어 웁니다.");
	}
	public String toString() {
		return "참새의 이름은 짹짹 입니다.";
	}
	
	
	private String name;
	private int legs;
	public Sparrow() {
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public Sparrow(String name, int legs) {
		super();
		this.name = name;
		this.legs = legs;
	}

	
	
}


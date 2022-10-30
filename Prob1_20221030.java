package Git;

public class Prob1_20221030 {
	public static void main(String[] args) {
		Tv t = new Tv();
		t.print();  // 첫번째 출력문
		t.power();
		t.print();  // 두번째 출력문
		t.channelUp();
		t.channelUp();
		t.print(); // 세번째 출력문
	}
}

class Tv{
	//멤버변수
	String color;
	boolean power;
	int channel;
	//생성자
	
	public Tv(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}


	public Tv() {
		this("black",false,0);
		
	}
	
	
	//메소드
	public void power() {
		power = power == true? false:true;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	public void print() {
		System.out.println("color : " + color +"\tpower : " + power +"\tchannel : " + channel );
	}
	
	
}
package Git;

public class Wheeler {
	protected int velocity;
	protected String carName;
	protected int wheelNumber;

	public Wheeler(int velocity, String carName, int wheelNumber) {
		super();
		this.velocity = velocity;
		this.carName = carName;
		this.wheelNumber = wheelNumber;
	}

	public void speedUp(int speed) {

	}

	public void speedDown(int speed) {
	}

	public void stop() {
		velocity = 0;
		System.out.println("정지상태로 속도를 0으로 초기화합니다.");
	}
}

class Truck extends Wheeler{
	
	Truck(String carName,int velocity,  int wheelNumber){
		super(velocity,carName,wheelNumber);
	}
	public void speedUp(int speed) {
		velocity = velocity + (speed *5);
		
		
		if(velocity >100) {
			velocity = 100;
			System.out.println("트럭의 최고속도 위반으로 속도를 " +velocity+"으로 내립니다.");
		}else {
			System.out.println("트럭의 현재 속도는 " +velocity+"입니다.");
		}
	}
	
	public void speedDown(int speed) {
		velocity = velocity - (speed *5);
		
		if(velocity < 50) {
			velocity = 50;
			System.out.println("트럭의 최저속도 위반으로 속도를 " +velocity+"으로 올립니다.");
		}else if(velocity < 50) {
				velocity = 50;
				System.out.println("트럭의 최저속도 위반으로 속도를 " +velocity+"으로 올립니다.");
		}else {
			System.out.println("트럭의 현재 속도는 " +velocity+"입니다.");
		}
		
		
	}
	
}


class Bike extends Wheeler{
	Bike(String carName, int velocity, int wheelNumber){
		super(velocity,carName,wheelNumber);
	}
	public void speedUp(int speed) {
		velocity += speed;
		
		if(velocity >40) {
			velocity = 40;
			System.out.println("자전거의 최고속도 위반으로 속도를 " +velocity+"으로 내립니다.");
		}else {
			System.out.println("자전거의 현재 속도는 " +velocity+"입니다.");
		}
		
		
	}
	
	
	public void speedDown(int speed) {
		velocity -= speed;
		
		if(velocity < 10) {
			velocity = 10;
			System.out.println("자전거의 최저속도 위반으로 속도를 " +velocity+"으로 올립니다.");
		}else {
			System.out.println("자전거의 현재 속도는 " +velocity+"입니다.");
		}
	}
	

	
	
	
}











package Git;

public class Prob1{
public static void main(String[] args) {
	Truck truck = new Truck("트럭", 50, 4);
	Bike bike = new Bike("자전거", 10, 2);
	System.out.println(truck.carName + 
		" : 바퀴 " + truck.wheelNumber + "개입니다");
	System.out.println(bike.carName +
		" : 바퀴 " + bike.wheelNumber + "개입니다");	
//	wheelers[1] = bike;	
	for(int i = 0; i < 2; i++){
		truck.speedUp(10); //현재속도
		bike.speedUp(15);  //현재속도
		
		truck.speedDown(50);
		bike.speedDown(50);	
		
		truck.stop();
		bike.stop();		
	}
	
	
	
}
}


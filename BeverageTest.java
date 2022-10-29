package Git;

public class BeverageTest {
	
	private int price;
	private String type;
	
	
	public BeverageTest() {
		
	}
	public BeverageTest(int price, String type) {
		super();
		this.price = price;
		this.type = type;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static void main(String[] args) {

        Coffee obj1 = new Coffee("커피",2500,"아메리카노");
        Coffee obj2 = new Coffee("커피",2700,"카페라뗴");
        Coffee obj3 = new Coffee("커피",300,"카푸치노");
        obj1.print();
        obj2.print();
        obj3.print();
//      System.out.println("타입:커피,이름:아메리카노,가격:2500");
//      System.out.println("타입:커피,이름:카페라뗴,가격:2700");
//      System.out.println("타입:커피,이름:카푸치노,가격:300");
	}
}
class Coffee extends BeverageTest{
	private String coffee;
	
	public Coffee() {
		
	}
	public Coffee(String coffee) {
		super();
		this.coffee = coffee;
	}
	public Coffee(String coffee, int price, String type) {
		super(price, type);
		this.coffee = coffee;
	}





	public String getCoffee() {
		return coffee;
	}
	public void setCoffee(String coffee) {
		this.coffee = coffee;
	}
	public void print() {
		System.out.println("타입 : "+ getType() + ", 이름 : " + getCoffee() + ", 가격 : " + getPrice() );
	}
}

//getSalesInfo메소드
// getTotalPrice메소드

package Git;

public class CoffeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop영업개시****");
		Beverage[] beverage = new Beverage[5];
		beverage[0] = new CoffeeK("Cappuccino");
		beverage[1] = new CoffeeK("CafeLatte");
		beverage[2] = new Tea("ginsengTea");
		beverage[3] = new CoffeeK("CafeLatte");
		beverage[4] = new Tea("redginsengTea");
		
		getSalesInfo(beverage);
		System.out.println("총 판매 금액==>" + getTotalPrice(beverage));
		
		System.out.println("Coffe의 판매 개수=>" + CoffeeK.amount + "잔");
		System.out.println("Tea의 판매 개수=>" + Tea.amount + "잔");
	}

	// 결과와 같이 가격을 구하고 판매정보를 출력할 수 있도록 getSalesInfo메소드를 작성하세요

	// 결과와 같이 총 판매금액을 구할 수 있도록 getTotalPrice메소드를 작성하세요.
	
	public static void getSalesInfo(Beverage[] beverage) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < beverage.length; i++) {
			beverage[i].calcPrice();
			System.out.println((i+1) + "번째 판매음료는 " + beverage[i].getName() + "이며, 가격은 " + beverage[i].getPrice());
		}
	}

	public static int getTotalPrice(Beverage[] beverage) {
		int result = 0;
		for (int i = 0; i < beverage.length; i++) {
			result += beverage[i].getPrice();
		}
		return result;

	}
}

abstract class Beverage {
	// 매개변수
	private String name;
	protected int price;

	// 생성자
	public Beverage() {
	}

	public Beverage(String name) {
		super();
		this.name = name;
	}

	public Beverage(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	// 게터세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 메소드
	abstract public void calcPrice();

	public void print() {

	}
}

class CoffeeK extends Beverage {
	// 매개변수
	static int amount;

	// 게터세터
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	// 생성자

	public CoffeeK(String name) {
		super(name);
	}

	public CoffeeK(int amount) {
		super();
		this.amount = amount;
	}

	public void calcPrice() {

		if (getName().equals("Americano")) {
			setPrice(1500);
		} else if (getName().equals("CafeLatte")) {
			setPrice(2500);
		} else if (getName().equals("Cappuccino")) {
			setPrice(3000);
		}
		amount++;
	}

}

class Tea extends Beverage {
	// 매개변수
	 static int amount;

	// 게터세터
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	// 생성자
	public Tea(String name) {
		super(name);
	}

	public Tea(int amount) {
		super();
		this.amount = amount;
	}

	public void calcPrice() {
		if (getName().equals("lemonTea")) {
			setPrice(1500);
		} else if (getName().equals("ginsengTea")) {
			setPrice(2000);
		} else if (getName().equals("redginsengTea")) {
			setPrice(2500);
		}
		amount++;
	}

}

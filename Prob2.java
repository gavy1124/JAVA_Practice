package Git;

public class Prob2 {
	public static void main(String[] args) {

		Drink coffee = new Drink("커피", 1500, 4);
		Drink tea = new Drink("녹차", 1100, 7);
		Alcohol wine = new Alcohol("와인", 5000, 3, 15.1);

		System.out.println("***** 매 출 전 표 ***** ");
		coffee.printTitle();
		coffee.printData();
		tea.printData();
		System.out.println();

		wine.printTitle();
		wine.printData();

		int sum = coffee.getTotalPrice() + tea.getTotalPrice() + wine.getTotalPrice();

		System.out.println();
		System.out.println("*** 총금액 " + sum + "원 ***");//

	}
}

class Drink {
	// 멤버변수
	private String name;
	private int price;
	private int count;

	// 생성자

	public Drink() {
		super();
	}

	public Drink(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}

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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// 메소드

//	int sum = coffee.getTotalPrice()
//			  + tea.getTotalPrice()
//			  + wine.getTotalPrice();

	public int getTotalPrice() { // 금액(단가*수량)
		return getPrice() * getCount();
	}

	public void printTitle() { // 타이틀출력
		System.out.println("상품명 \t단가 \t수량 \t금액");
	}

	public void printData() { // 상품정보출력
		System.out.println(name + "\t" + getPrice() + "\t" + getCount() + "\t" + (getPrice() * getCount()));

	}

}

class Alcohol extends Drink {
	// 맴버변수
	private double alcper; // 알코올 도수

	// 생성자
	public Alcohol() {
		super();
	}

	public Alcohol(String name, int price, int count, double alcper) {
		super(name, price, count);
		this.alcper = alcper;
	}

	public double getAlcper() {
		return alcper;
	}

	public void setAlcper(double alcper) {
		this.alcper = alcper;
	}

	// 메소드(오버라이딩)
	public void printTitle() {// 타이틀출력
		System.out.println("상품명(도수[%]) \t단가 \t수량 \t금액");
	}

	public void printData() {// 상품정보출력
		System.out.println("    " +getName() + "\t\t" + getPrice() + "\t" + getCount() + "\t" + (getPrice() * getCount()));
	}

}
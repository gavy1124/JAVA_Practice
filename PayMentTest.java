package Git;

public class PayMentTest {

	// main() : 수정하지 마세요.
	public static void main(String[] args) throws PayException {

		CardPayment card1 = new CardPayment("11번가", "Java책", 17000, "123-432-111", "0070", 0);
		payProcess(card1);
		System.out.println("-------------------------------------");
		CashPayment cash1 = new CashPayment("인터파크", "에어컨", 2400000, "198-32");
		payProcess(cash1);
		System.out.println("-------------------------------------");

		// 아래는 Exception 발생 테스트 코드임. 주석을 풀고~ Exception 처리되는지 확인 해 보세요.

		// Exception 예제 1. 문제파일의 출력 그림 참고하세요.
		 CardPayment card2 = new CardPayment("예스24", "소설책", 2000, "843-12-434",
		 "1234", -2);
		 payProcess(card2);
		 System.out.println("-------------------------------------");
		// Exception 예제 2. 문제파일의 출력 그림 참고하세요.
		CashPayment cash2 = new CashPayment("G마켓","핸드폰",0,"999-56");
		payProcess( cash2 );		
		System.out.println("-------------------------------------");	
	}

	// payProcess() : 수정하지 마세요.
	public static void payProcess(Payment p) throws PayException {
		p.pay();
		System.out.println(p);
	}

}

//-----------------------------------------------------------------------------
interface Payable {
	public void pay() throws PayException;
}

//-----------------------------------------------------------------------------
class PayException extends Exception {

	public PayException(String message) {
		super(message);
	}
}

//-----------------------------------------------------------------------------
abstract class Payment implements Payable {
	// 멤버변수
	protected String shopName;
	protected String productName;
	protected long productPrice;

	// 게터세터
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public long getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}

	// 생성자
	public Payment() {
	}

	public Payment(String shopName, String productName, long productPrice) {
		super();
		this.shopName = shopName;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	// 메소드
	abstract public void payment(String shopName, String productName, String productPrice);
}
//-----------------------------------------------------------------------------

class CardPayment extends Payment {
	// 멤버변수
	private String cardNumber;
	private String cardPassword;
	private int monthlyInstallment;

	// 생성자
	public CardPayment() {
	}

	public CardPayment(String cardNumber, String cardPassword, int monthlyInstallment) {
		super();
		this.cardNumber = cardNumber;
		this.cardPassword = cardPassword;
		this.monthlyInstallment = monthlyInstallment;
	}

	// 게터세터
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardPassword() {
		return cardPassword;
	}

	public void setCardPassword(String cardPassword) {
		this.cardPassword = cardPassword;
	}

	public int getMonthlyInstallment() {
		return monthlyInstallment;
	}

	public void setMonthlyInstallment(int monthlyInstallment) {
		this.monthlyInstallment = monthlyInstallment;
	}

	public CardPayment(String shopName, String productName, long productPrice, String cardNumber, String cardPassword,
			int monthlyInstallment) {
		this.shopName = shopName;
		this.productName = productName;
		this.productPrice = productPrice;
		this.cardNumber = cardNumber;
		this.cardPassword = cardPassword;
		this.monthlyInstallment = monthlyInstallment;
	}

	public String toString() {
		String result ="신용카드가 정상적으로 지불되었습니다."
				+"\n"+"[ 신용카드결제정보 ]"
				+"\n"+"상점명 : " + shopName
				+"\n"+"상품명 : " + productName
				+"\n"+"상품가격 : " + productPrice
				+"\n"+"신용카드번호 : " + cardNumber
				+"\n"+"할부개월 : " + monthlyInstallment;
		return result;
	}

	@Override
	public void pay() throws PayException {

		if (productPrice <= 0 || monthlyInstallment < 0) {
			throw new PayException("가격이나 할부개월수가 잘못되었습니다.");
		}
	}

	@Override
	public void payment(String shopName, String productName, String productPrice) {
		// TODO Auto-generated method stub

	}
}

//-----------------------------------------------------------------------------
class CashPayment extends Payment {
	// 맴버변수
	private String cashReceiptNumber;

	// 생성자
	public CashPayment() {
	}

	public CashPayment(String cashReceiptNumber) {
		super();
		this.cashReceiptNumber = cashReceiptNumber;
	}

	// 게터세터
	public String getCashReceiptNumber() {
		return cashReceiptNumber;
	}

	public void setCashReceiptNumber(String cashReceiptNumber) {
		this.cashReceiptNumber = cashReceiptNumber;
	}

	public CashPayment(String shopName, String productName, long productPrice, String cashReceiptNumber) {
		this.shopName = shopName;
		this.productName = productName;
		this.productPrice = productPrice;
		this.cashReceiptNumber = cashReceiptNumber;
	}

	// 메소드

	public String toString() {
		String result ="신용카드가 정상적으로 지불되었습니다."
				+"\n"+"[ 신용카드결제정보 ]"
				+"\n"+"상점명 : " + shopName
				+"\n"+"상품명 : " + productName
				+"\n"+"상품가격 : " + productPrice
				+"\n"+"현금영수증번호 : " + cashReceiptNumber;
		return result;
	}

	@Override
	public void pay() throws PayException {
		if(productPrice <= 0){ 
			throw new PayException("가격이 잘못되었습니다.");
		}

	}

	@Override
	public void payment(String shopName, String productName, String productPrice) {
		// TODO Auto-generated method stub

	}

}

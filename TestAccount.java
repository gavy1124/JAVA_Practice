package Git;

public class TestAccount {
	String accid;
	String ownerName;
	long balance;
	//잔액조회메소드
	public TestAccount() {
		
	}
	public TestAccount(String accid, String ownerName, long balance) {
		super();
		this.accid = accid;
		this.balance = balance;
		this.ownerName = ownerName;
	}

	
	
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	//입금 메소드
	public void deposit(long amount) {
		
	}
	
	//출금 메소드
	public void withdraw(long amount) {
		
	}
	
	public static void main(String[] args) {
		CheckingAccount acc1 = new CheckingAccount("111-222-333","장동건",1000000,"1234-5647-8888");
		acc1.pay("1234-5678-8888", 500000);
		System.out.println("현재잔액====>"+acc1.getBalance());
		acc1.pay("1234-5647-8888", 500000);
		System.out.println("현재잔액====>"+acc1.getBalance());
	}

}
class CheckingAccount extends TestAccount{
	public void pay(String cardNo, long amount ){
		if(this.cardNo.equals(cardNo)) {
			if(amount <balance) {
				//System.out.println("지불이 가능합니다.");
				balance -= amount;
			}else {
				System.out.println("지불이 불가능합니다.");
			}
		}else {
			System.out.println("지불이 불가능합니다.");
			
		}
	}
	
	
	
	String cardNo;
	
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public CheckingAccount() {
		
	}
	public CheckingAccount(String accid, String ownerName, long balance, String cardNo) {
		super(accid,ownerName,balance);
		this.cardNo = cardNo;
	}

	
	
	
	
	
}



















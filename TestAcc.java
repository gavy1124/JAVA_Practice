package Git;
public class TestAcc {
    public static void main(String[] args) throws Exception {
        String accNo = null;
        int balance = 0;

        Account accObj = new Account();
		accObj.setAccNo("078-3762-293");
        accNo = accObj.getAccNo();
        balance = accObj.getBalance();
        
        System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");

        accObj.save(100);
        balance = accObj.getBalance();
        System.out.println(accObj.getAccNo() + " 계좌의 잔고는 " + balance + "만원입니다.");

        accObj.deposit(30);
        balance = accObj.getBalance();
        System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");
    }

}
class Account{
	private String AccNo;
	private int balance;
	
	public void save(int s) {
		System.out.println(AccNo + " 계좌에 "+ s + "만원이 입금되었습니다.");
		setBalance(s);
	}
	
	public void deposit(int s) {
		System.out.println( AccNo + " 계좌에" + s + "만원이 출금되었습니다.");
		balance -= s;
		
	}
	
	public int getAccNo(int s) {
		int result = 0;
		return result;
	}
	
	
	
	public Account(String accNo, int balance) {
		super();
		AccNo = accNo;
		this.balance = balance;
	}
	public String getAccNo() {
		return AccNo;
	}
	public void setAccNo(String accNo) {
		System.out.println(accNo +" 계좌가 계설되었습니다.");
		AccNo = accNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public Account() {
		
	}
	
}
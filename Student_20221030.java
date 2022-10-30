package Git;

public class Student_20221030 {
	//멤버변수
	String name;
	String subject;
	int fee;
	double returnFee;

	//생성자
	public Student_20221030() {}
	public Student_20221030(String name, String subject, int fee) {
		super();
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}
	public Student_20221030(String name, String subject, int fee, double returnFee) {
		super();
		this.name = name;
		this.subject = subject;
		this.fee = fee;
		this.returnFee = returnFee;
	}
	
	//메소드
	
	public void calcReturnFee() {
		if(subject == "javaprogram") {
			returnFee = fee * 0.25;
		}else if(subject == "jspprogram") {
			returnFee = fee * 0.20;
		}else {
			System.out.println("그런 과정명은 없습니다.");
		}
	}
	public void print() {
		System.out.printf("%s씨의 과정명은 %s이고 교육비는 %d이며 환금급은 %f 입니다.",name, subject, fee, returnFee);
	}
	
public static void main(String args[]){
	Student_20221030 stu = new Student_20221030("장동건", "jspprogram",500000);
	 stu.calcReturnFee();
	 stu.print();
}

	
}  

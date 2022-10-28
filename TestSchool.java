package Git;

public class TestSchool {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("홍길동");
		s.setAge(20);
		s.setId(200201);
		Teacher t = new Teacher ();
		t.setName("이순신");
		t.setAge(30);
		t.setSubject("JAVA");

		Staff  e = new Staff();
		e.setName("유관순");
		e.setAge(40);
		e.setDept("교무과");
		
		s.print();
		t.print();
		e.print();
	}

}


class Student{
	private String Name;
	private int Age;
	private int Id;
	
	public void print() {
		System.out.println("이름 : " +Name +"\t 나이 : " + Age + "\t 학번 : "+ Id);
	}
	
	public Student() {}
	public Student(String name, int age, int id) {
		super();
		Name = name;
		Age = age;
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	
}
class Teacher{
	private String Name;
	private int Age;
	private String Subject;
	public void print() {
		System.out.println("이름 : " +Name +"\t 나이 : " + Age + "\t 과목 : "+ Subject);
	}
	public Teacher() {}
	public Teacher(String name, int age, String subject) {
		super();
		Name = name;
		Age = age;
		Subject = subject;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	
}
class Staff{
	private String Name;
	private int Age;
	private String Dept;
	public void print() {
		System.out.println("이름 : " +Name +"\t 나이 : " + Age + "\t 부서 : "+ Dept);
	}
	public Staff() {}
	public Staff(String name, int age, String dept) {
		super();
		Name = name;
		Age = age;
		Dept = dept;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	
}

















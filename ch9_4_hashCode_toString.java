package Git;

import java.util.Objects;

class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}

	// object의 eqauls()를 오버라이딩해서 주소가 아닌 value를 비교
	public boolean equals(Object obj) {
		//this == obj;
		if(!(obj instanceof Value))return false;
			
		Value v = (Value)obj;
		
		return this.value == v.value;
	}
	
	
	
	
}



class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE",1);
	}

	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
	
	// eqauls 오버라이딩
	public boolean equals(Object obj) {
		if(!(obj instanceof Card))
			return false;
		
		Card c= (Card)obj;
		return this.kind.equals(c.kind) && this.number==c.number;
	}
	
	// eqauls()를 오버라이딩하면 hashCode()도 오버라이딩 해야한다.
	public int hashCode() {
			return Objects.hash(kind, number);
		}
	
	
	
	
	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}
	
	
	
}








class Person{
	long id;
	
	public Person(long id) {
		super();
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		return this.id == ((Person)obj).id; 
	}
}


public class ch9_4_hashCode_toString {
	public static void main(String[] args) {
		Person p1 = new Person(8011L);
		Person p2 = new Person(8011L);
		
		if(p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");
		
		System.out.println("-------------------------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.equals(c2));
		
		
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(c2));
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println("----------------------------------------------------");
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
		
		
		
		
		
		
	}

}

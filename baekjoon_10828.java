package Git;

import java.util.Scanner;

class MyStack{
	private int[] mystack;
	private int top_position;
	public Mystack() {
		mystack ms = new mystack[15];
	}
	baekjoon_10828 k = new baekjoon_10828();
	
	//pop(린턴값o), push(린턴값x) , top, empty , size(린턴값o) 메소드구현
	public int pop() {
		int result = 0;
		result = ms[i].pop(); 
		return result;
	}
	public void push() {
		ms[i] = str[1];
	}
	public int top() {
		System.out.println(ms[i]);
	}
	public int empty() {
		if(ms.empty == true) {
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}
	public int size() {
		int result = 0;
		result = ms.length;
		return = result;
	}
	
	
}

public class baekjoon_10828 {
	public static void main(String[] args) {
		//1.스캐너객체생성
		Scanner scan = new Scanner(System.in);
		//2. Mystack객체생성
		MyStack[] ms = new MyStack[15];
		
		
		//3. 몇번할지
		int count  = scan.nextInt();
		for (int i = 0; i < count; i++) {
			//실행횠수만큼 pop, push , top, empty , size 입력 (예시처럼)
			String line = scan.nextLine();
			
			//14
			//push 1
			
			String[] str = line.split(" ");  // 배열 0, 1 발생 
			//if문이나 switch문 이용해서 
			
			switch(str[0] == str) {
			case "push" :
				ms.push();
			case "pop" :
				ms.pop();
			case "empty" :
				ms.empty();
			case "size" :
				ms.size();
			case "top" :
				ms.top();
			}
			
		}
		
		
		
	}

}

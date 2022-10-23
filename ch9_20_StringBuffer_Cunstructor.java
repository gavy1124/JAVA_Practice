package Git;

public class ch9_20_StringBuffer_Cunstructor {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("01"); // ""없이 숫자넣으면 안들어감
		StringBuffer sb2 = sb.append(23);  
		sb.append('4').append(56);
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);
		
		
		System.out.println("sb  :  " +sb);  // 예상 : 012345678
		System.out.println("sb2 :  " +sb2); // 예상 : 0123 
		System.out.println("sb3 :  " +sb3); // 예상 : 0123456789.0 
		// 위와같이 예쌍했으나, StringBuffer는 한번 대입되면 같은 참조주소를 이용하며,
		// 같은참조주소이므로 동일하게 변경됨
		
		System.out.println("------------------------------------");
		
		System.out.println("sb = " + sb.deleteCharAt(10));
		// 01234567890
		
		System.out.println("sb = " + sb.delete(3,6));
		//01267890
		
		System.out.println("sb = " + sb.insert(3,"abc"));
		//01267abc890  //땡 3이될자리에 넣는다생각하면됨 // 012abc67890
		
		System.out.println("sb = " + sb.replace(6,sb.length(),"end")); 
		//01267aend
		
		
		
		System.out.println("sb = " + sb.capacity());  //기본개수 18
		//01267aend
		
		
		
		
	}

}

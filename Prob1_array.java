package Git;
public class Prob1_array {
	public static void main(String[] args) {

		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		
		int[] ib = new int[]{1,2,3,4,5};
		
		int odd= 0;
		int even= 0;
		
		for (int i = 0; i < ia.length; i++) {
			if(ia[i] % 2 == 1) {
				odd += ia[i];
			}else {
				even += ia[i];
			}
		}
		System.out.println("( 배열 ia )");
		System.out.println("홀수의 합 : " + odd);
		System.out.println("짝수의 합 : " + even);
		
		System.out.println("----------------------------");
		int odd2= 0;
		int even2= 0;
		
		for (int i = 0; i < ib.length; i++) {
			if(ib[i] % 2 == 1) {
				odd2 += ib[i];
			}else {
				even2 += ib[i];
			}
		}
		System.out.println("( 배열 ib )");
		System.out.println("홀수의 합 : " + odd2);
		System.out.println("짝수의 합 : " + even2);
	}
	
	
}

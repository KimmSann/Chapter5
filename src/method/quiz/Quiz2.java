package method.quiz;

public class Quiz2 {
	public static int hap(int n1 , int n2) {
		int result = 0;
		
		
		for(int i = n1; i <=n2; i++) {
			result = result + i ;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 10;
		int sum = hap(n1,n2);
		System.out.println(sum);
	}

}

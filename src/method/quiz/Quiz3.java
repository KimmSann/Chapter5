package method.quiz;

public class Quiz3 {
	public static int num(int n1,  int n2) {
		if (n1 > n2) {
			return n1;
		}else {
			return n2;
			
		}
	}
	public static void main(String[] args) {
		int result1 = num(10, 5);
		int result2 = num(100, 200);
		int result3 = num(15, 88);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}

}

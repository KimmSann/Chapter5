package method.quiz;

public class Quiz7 {
	public static void hap(int num) {
		int sum = 0;
		sum = sum + (num%10);
		
		num = num/10;
		
		num = num/10;
		
		sum = sum + num;
		
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		
	}

}

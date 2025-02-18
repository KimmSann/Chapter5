package method;

public class Ex1 {

	public static void method1() {
		System.out.println("매개변수와 리턴값이 없는 메소드입니다.");
		
		

	

	}
	
//	public static void main(String[] args) {
//		
//		method1();
//		method1();
//		method1();
//	}
	public static String method2() {
		return " 매개변수는 없고 리턴값은 있는 메소드입니다.";
	}
	public static void method3(int num) {
		System.out.println("num: " + num);
	}
	public static int method4(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	public static void main(String[] args) {
		method4(0, 0);
		
	}

}

package method.quiz;

public class Quiz6 {
	
	public static void gye(int n1, int n2 , char oper) {
		
		int result = 0;
		
		switch(oper) {
		case '+':
			result = n1 + n2;
			System.out.println(n1+ "+" + n1+"=" + result);
			break;
			
		case '-':
			result = n1 - n2;
			System.out.println(n1 + "-" + n2 + "=" + result);
			break;
		case '*':
			result = n1 * n2;
			System.out.println(n1 + "*" + n2 + "=" + result);
			break;
		case '/':
			result = n1 / n2;
			System.out.println(n1 + "/" + n2 +"=" + result);
			break;
		}
	}
	
	
	public static void main(String [] args) {
		gye(1, 2 , '+');
		gye(5, 2 , '-');
		gye(5,5,'*');
		gye(6,6,'/');
			
		
	}

}

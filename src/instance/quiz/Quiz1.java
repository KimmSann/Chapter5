package instance.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "James";
		person.age = 40;
		person.isMarried = true;
		person.numberOfChildren = 3;
		
		System.out.println("이름 :" + person.name);
		System.out.println("나이 :" + person.age);
		System.out.println("결혼 여부 :" + person.isMarried);
		System.out.println("자녀 수 :" + person.numberOfChildren);
	}
}

class Person {
	String name; 
	int age; 
	boolean isMarried; 
	int numberOfChildren; 
}

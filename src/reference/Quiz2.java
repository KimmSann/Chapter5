package reference;

public class Quiz2 {

	public static void main(String[] args) {
		
		Employee employee = new Employee(null, 0, 0, 0);

	}

}

class Employee{
	String emName;
	int age;
	int salary;
	int gn;
	public Employee(String emName, int age, int salary, int gn) {
		this.emName = emName;
		this.age = age;
		this.salary = salary;
		this.gn = gn;
	}
		
}
class Department{
	Employee A;
	Employee B;
	Employee C;
	
}
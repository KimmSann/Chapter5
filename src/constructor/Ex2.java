package constructor;

public class Ex2 {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "둘리";
		person1.height = 150;
		person1.weight = 50;

		Person person2 = new Person("또치");
		person2.height = 170;
		person2.weight = 70;
		
		
		Person person3 = new Person("도우너", 180, 80);
	}

}

class Person{
	String name;
	int height;
	int weight;


     public Person() {
     }	
     
     public Person(String nm) {
    	 
     }
     public Person(String nm, int he, int we) {
 		name = nm;
 		height = he;
 		weight = we;
 	}
	
}



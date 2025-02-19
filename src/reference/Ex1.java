package reference;

public class Ex1 {
	
	public static void main(String[] args) {
		
		Subject math = new Subject("수학", 85);
		Subject kor = new Subject("국어", 100);
		
		Student student = new Student(1001, "둘리", math, kor);
		
	}

}

class Subject {
	String subjectName;
	int scorePoint;
	public Subject(String subjectName, int scorePoint) {
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}
	
	
}

class Student{
	int studentId;
	String studentName;
	Subject math;
	Subject kor;
	public Student(int studentId, String studentName, Subject math, Subject kor) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.math = math;
		this.kor = kor;
	}
	
}
package constructor;

public class Quiz1 {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.bookName = "스프링 부트";
		book1.price = 30000;
		book1.purblicer ="한빛 출판사";
		book1.page = 200;
		
		
		Book book2 = new Book("자바 프로그래밍",20000, " 한밫 출판사" , 200);
		

	}

}

class Book {
	
	String bookName;
	int price;
	String purblicer;
	int page;
	
	public Book() {
		
	}

	public Book(String bookName, int price, String purblicer, int page) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.purblicer = purblicer;
		this.page = page;
	}
	
	
}
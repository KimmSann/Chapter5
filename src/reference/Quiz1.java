package reference;



public class Quiz1 {

	public static void main(String[] args) {
		Book book1 = new Book("책1" , 25000 , "ㅁㅁ출판사" , 100);
		Book book2 = new Book("책2" , 30000 , "ㅅㅅ출판사" , 50);
		Book book3 = new Book("책3" , 27000 , "ㅇㅇ 출판사" , 80);
		
		Member member = new Member(1001, "둘리", book1, book2, book3);

	}

}

class Book{
	String bookName;
	int bookPrice;
	String publicher;
	int page;
	
	public Book(String bookName, int bookPrice, String publicher, int page) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.publicher = publicher;
		this.page = page;
	}
	
	
	
}

class Member{
	int memberNum;
	String memberName;
	Book book1;
	Book book2;
	Book book3;
	public Member(int memberNum, String memberName, Book book1, Book book2, Book book3) {
	
		this.memberNum = memberNum;
		this.memberName = memberName;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}
	
}

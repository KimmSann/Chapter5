package instance.quiz;

public class Quiz3 {
	
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.bookName = " 자바 프로그레밍" ;
		book1.price = 20000;
		book1.publisher = "한빛 컴퍼니";
		book1.page = 500;
		book1.showBookInfo();
		System.out.println("인스턴스 정보 :" +  book1 );
		System.out.println();
		
		Book book2 = new Book();
		book2.bookName = " 스프링";
		book2.price = 15000;
		book2.publisher = "한빛 컴퍼니";
		book2.page = 500;
		book2.showBookInfo();
		System.out.println("인스턴스 정보 :" + book2);
		System.out.println();
	}

}

class Book{
	String bookName;
	int price;
	String publisher;
	int page;
	
	public  void showBookInfo() {
		System.out.println("제목 : " +  bookName + "가격 :" + price + "출판사 : " + publisher + "페이지 수 :" + page);
	}
}

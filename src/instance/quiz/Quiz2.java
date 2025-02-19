package instance.quiz;

public class Quiz2 {
	public static void main(String [] args) {
		Order order = new Order();
		order.orderNum = 1111;
		order.orderDate = "2025년 2월 19일";
		order.orderName = "둘리";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		order.showOrderInfo();
	}

}

class Order{
	
	int orderNum;
	String orderDate;
	String orderName;
	String address;
	
	public void showOrderInfo() {
		System.out.println("주문번호:" + orderNum + ", 주문날짜:" + orderDate + ", 주문자이름: " + orderName + ", 배송지:" + address);
	}
}
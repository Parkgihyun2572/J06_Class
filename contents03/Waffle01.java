package contents03;

public class Waffle01 {
	//필드: 와플 정보
	String name;
	int price;
	
	//기본 생성자의 실행문을 사용자가 직접 정의
	Waffle01(){
		System.out.println("기본 생성자 작동");
	}
	
	//필드를 초기화할 메소드
	void setData(String n, int p) {
		name = n;
		price = p;
	}
	
	//필드 정보를 출력해주는 메소드
	void showData() {
		System.out.println("이름: "+name
				+", 가격: " + price);
	}
}

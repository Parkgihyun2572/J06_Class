/*
# 클래스 구성
	class 클래스이름{
		필드
		메소드
	}

# 필드(Field), 멤버 변수
객체의 속성(상태, 정보)을 저장

# 메소드(Method), 멤버 함수
객체의 기능을 수행

*/
package contents01;

public class Person {
	//필드(멤버 변수)
	String name;
	int age;
	double sight;
	String hobby;
	
	//메소드(멤버 함수)
	void show_profile() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("시력: "+sight);
		System.out.println("취미: "+hobby);
	}
}

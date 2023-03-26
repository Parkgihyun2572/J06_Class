/*
# 생성자(Constructor)
new 키워드로 객체를 생성할 때 호출되어 객체 필드를 초기화한다. 

# 기본 생성자(디폴트 생성자)
	클래스명(){ }

- 매개변수가 없는 생성자
- 클래스에 선언된 생성자가 하나도 없으면 기본 생성자가 자동으로 만들어진다.

# 생성자 선언
	클래스명(매개변수..){
		객체의 초기화 코드
	}
*/
package contents03;

public class C03_Constructor {
	public static void main(String[] args) {
		//(자동으로 만들어진)기본 생성자를 호출하여 객체 생성
		Waffle00 w0 = new Waffle00();
		
		//new키워드로 객체를 만들때 생성자가 호출된다.
		Waffle01 w1 = new Waffle01(); //생성자 내부 코드 작동
		w1.setData("일반와플", 3000);
		w1.showData();
	}
}

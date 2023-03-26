/*
# 메소드 오버로딩(Overloading)
하나의 클래스에 같은 이름의 메소드를 여러개 선언하는 것
같은 이름의 메소드로 입력 매개값에 따라 다른 메소드를 호출하여 사용한다.

# 오버로딩의 조건
1. 메소드 이름이 같아야한다.
2. 매개변수의 개수 혹은 타입이 달라야한다.

*/
package contents02;

public class C02_Overloading {
	public static void main(String[] args) {
		/* 사각형 형태에 따른 넓이 구하기 */
		Rectangle sagak = new Rectangle();
		
		//직사각형 넓이 구하기
		int res1 = sagak.area(15, 20);
		System.out.println(res1);
		
		//정사각형 넓이 구하기
		int res2 = sagak.area(10);
		System.out.println(res2);
		
		/* 선택한 와플에 따른 주문내역 나타내기 */
		Waffle waf = new Waffle();
		
		//소스 없는 와플 주문
		String w0 = waf.name();
		System.out.println(w0 + " 주문하였습니다.");//매개값X
		
		//소스 1개인 와플 주문
		String w1 = waf.name("누텔라");
		System.out.println(w1 + " 주문하였습니다.");//매개값 1개
		
		//소스 2개인 와플 주문
		String w2 = waf.name("누텔라","아이스크림");
		System.out.println(w2 + " 주문하였습니다.");//매개값 2개(문자열, 문자열)
		
		//소스 1개인 와플을 n개 주문
		String w3 = waf.name("누텔라", 3);
		System.out.println(w3 + " 주문하였습니다.");//매개값 2개(문자열, 정수)

		/* println도 오버로딩된 메소드 */
		//println 우클릭 - Open Declaration에서 메소드 선언 확인
		System.out.println();
		System.out.println(10);
		System.out.println('A');
		System.out.println("println overloading");
		System.out.print("");
	}
}

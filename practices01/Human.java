package practices01;

public class Human {
	String name;
	int birthYear;

	void hello() {
		System.out.println("반갑습니다!");
	}
	
	void introduce() {
		System.out.println("제 이름은 " + name + "입니다.");
	}
	
	void age() {
		int age = 2023 - birthYear + 1;
		System.out.println("올해로 "+age+
				"세 입니다.");
	}
}

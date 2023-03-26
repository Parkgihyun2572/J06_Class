package practices01;

public class Prac01 {
	public static void main(String[] args) {
		Student one = new Student();
		
		//맴버 변수 초기화
		one.name = "기현";
		one.subject = "java";
		one.birthMonth = 11;
		
		one.showSubject();
		one.birth();
	}
}

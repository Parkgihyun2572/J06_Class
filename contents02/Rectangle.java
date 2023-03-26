package contents02;

public class Rectangle {
	//직사각형의 넓이
	int area(int width, int height) {
		return width*height;
	}
	
	//정사각형의 넓이
	int area(int width) { //매개변수 1개
		return width * width;
	}
}

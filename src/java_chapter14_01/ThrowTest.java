package java_chapter14_01;

public class ThrowTest {

	public void checkAge(int age) {
		if(age<0) {//나이는 음수가없다
          throw new IllegalArgumentException();
	}
   System.out.println("정상적인 나이입니다.");
}
	}

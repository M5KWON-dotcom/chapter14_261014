package java_chapter14_01;

public class TryCatchTest01 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		//int result = num1/num2;  //num2가 0이면 에러발생!->try안에 넣기
		//예외처리문의 기본 문법
		try {
			int result = num1/num2;  //num2가 0이면 에러발생!
			System.out.println(result);
			int[] num = {10,20,30,40};
			System.out.println(num[3]);
			} catch(Exception e) {
			//	int result = num1/ 1;
			//	System.out.println(result);
			//System.out.println("에러가 발생했습니다. 다시 확인하세요.");
			   e.printStackTrace(); //해다 에러 메시지 출력
			}finally {
				System.out.println("finally블록은 에러가 있든 없든 무조건 실행됨");
				//마무리작업, 정리작업
		System.out.println("포로그램이 계속 실행됩니다.");
	}

}}

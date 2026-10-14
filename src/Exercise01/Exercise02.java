package Exercise01;

public class Exercise02 {

	public static void main(String[] args) {
   
		int num1=70;
		try {
			if(num1 >=0 && num1<=100) 
				System.out.println("정상적인 숫자입니다.");
				else {
				System.out.println("정상적인 숫자가 아닙니다. 다시 입력해주세요.");
				}
		} catch (Exception e) {
				e.printStackTrace();
		}

			finally {
				System.out.println("점수 확인이 완료되었습니다.");
			}

	}}
	

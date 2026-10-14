package java_chapter14_01;

public class ThrowsTest {

	public static void divide(int a) throws Exception{
			int result = 10/0;
			System.out.println(result);
	} 
		
	public static void main(String[] args) {
		try {
			divide(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

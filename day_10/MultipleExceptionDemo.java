package day_10;

public class MultipleExceptionDemo {
    public static void main(String[] args) {
		int brr[]= new int [4];
		
		try {
			brr[9]=50/0;
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
		}
		
		catch (CantrunException e) {
			e.printStackTrace();
			
		}
		System.out.println("i am the last line");

	}
}

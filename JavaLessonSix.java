public class JavaLessonSix{
	public static void main(String[] Args){
		divideByZero(2);
	}
	
	public static void divideByZero(int a){
		try{
			System.out.println(a/0);
		}
		catch(ArithmeticException e){
			System.out.println("You can't do that");
		}
	}
}
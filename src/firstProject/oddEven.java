package firstProject;

public class oddEven {
	static boolean isEven(int num) {
		return num % 2 == 0;
	}
	public static void main(String[] args) {
		int num = 4;
//		if(isEven(num))
//		{
//			System.out.println("it is even");
//			
//		}
//		else
//		{
//		System.out.println("it is odd");	
//		}
		System.out.println(isEven(num) ? "it is even ": "it is odd");
	}

}

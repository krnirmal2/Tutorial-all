package Array;

public class powefullfunction {
	// 0 to n arguments
	// use array data structure internally
//	(int... nos) means it create the array "nos" and put the each parameter inside
	//it like element of its
	
	static int nextGenAdd(int... nos) {// variance
		int sum = 0;
		for (int i= 0;i<nos.length;i++) {
			sum +=nos[i];
		}
		return sum;
	}

	
	public static void main(String[] args) {
		System.out.println(nextGenAdd());
		System.out.println(nextGenAdd(5));
		System.out.println(nextGenAdd(3,45,5));
		System.out.println(nextGenAdd(74,4,5,324,5,34,53));
	}
}

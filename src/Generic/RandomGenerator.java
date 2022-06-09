package Generic;

import java.util.Random;

public class RandomGenerator {
	// this is the generic type which take any data type 
	// for bound generic type to specific to any other type then we can
	// replace <T> by <T extends libraryclassOfSpecificType> 
	// example : <T extends Number>
	static <T> T randomElement(T cars[]) {
		
		Random  random = new Random();
		int index = random.nextInt(cars.length);
		
		return cars[index];
	}
	
	public static void main(String[] args) {
		String cars[] = {"a", "b", "c"};
		
		
		String randomElement = randomElement(cars);
		System.out.println(randomElement);
		
		// here the wrapper class comes into play 
		//because generic type only support REFERENCE TYPE
		// not primitive type 
		// so we write Integer inplace of int
		Integer no[]= {1, 43, 34 , 5};
		int n = randomElement(no);
		
		System.out.println(n);
		
		
	}
	
	

}

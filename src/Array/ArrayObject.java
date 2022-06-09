package Array;

import Student.Student;

public class ArrayObject {
	
	public static void main(String[] args) {
		//create empty array with specific the size of hte array initially
		// array of fixed size and never modified it size in java
		String cars[] = new String[4];
		
		//create an array where elements are known
		String[] fruits = {"mango", "lichi", "apple"};
		
		cars[0]="nirmal";
		System.out.println(cars[0]);
		
		fruits[1] = "banana";
		
		for(int i=0;i<fruits.length-1; i++) {
			System.out.println(fruits[i]);
		}
			
		
		
		
		
//		// create array of 3 student type and print the name and gender of each one
//		Student obj1 = new Student();
//		Student obj2 = new Student();
//		Student obj3 = new Student();
//		Student array[] = {obj1,obj2,obj3};
//		
//		for(int i=0; i<array.length-1;i++) {
//			System.out.println(array[i].name, array[i].gender);
//		}
//		
		
		
		
	}
	
	
	

}

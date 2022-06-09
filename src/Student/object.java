package Student;

public class object {
	
	public static void main(String[] args) {
		// create array of 3 student type and print the name and gender of each one
//					Student obj1 = new Student();
//					Student obj2 = new Student();
//					Student obj3 = new Student();
//					
//					Student array[] = {obj1,obj2,obj3};
		
		Student array[] = {new Student("Nirmal",'M',5,99.9f), 
						   new Student("Nmal",'M',5,99.9f),
						   new Student("rmal",'M',5,99.9f)};
				          
		
		

					
					for(int i=0; i<array.length;i++) {
//						System.out.println(array[i].name);
//						System.out.println(array[i].gender);
						//need to clear that how to use object oriented way to call the 
						// student object
						System.out.println(Student.getGenderName());
					}
					
		 
					
		
	}
	
	

}


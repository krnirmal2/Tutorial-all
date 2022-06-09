package Student;
// by default every class has an object in memory of type class which already build in class 
public class createStudentObjects {
	public static void main(String[] args) {
		//called the static variable
	    System.out.println(Student.count);
	    
	    // so when we need to create a studnet with out using new keyword to create
	    // object of student then we have to use static which helps to create a object of 
	    // student class which return a object for us a no need to write new keyword
	    //
	    Student.CreateObjectForUsWithOutNewKeyword("Nirmal",'M',5,99.9f);
	    //
		//internally working is 
		//Student(0x234)
		//s1 will store the address return by this Student function(default constructor)
		// new will assign address for the Student object
//		Student s1 = new Student();// Student object in the ram and assign the address to s1 variable
//		Student s2 = new Student();
		
//		s1.name = "nirmal";
//		s1.gender= 'M';
		
		// if we call default constructor without implicitly defined inside 
		// class when there is already defined some other constructor(parameterised constructor)
		// otherwise we got error 
//		Student s1 = new Student("Nirmal",'M',5,99.9f);
		
		
		// initialise the default value to the member varible without using parmeterised 
		//constructor
		Student s3 = new Student();
		/*
		System.out.println(s1.name = "nirmal");
		System.out.println(s1.gender= 'M');
		System.out.println(s1.Roll = 7);
		System.out.println(s1.marks= 99.99f);
		
		System.out.println("\n");
		
		System.out.println(s2.name = "Rahul");
		System.out.println(s2.gender= 'M');
		System.out.println(s2.Roll = 11);
		System.out.println(s2.marks= 90.99f);*/
		
		
		//internally implementation is like to send the argument is the s1 or s2 object which holding
		// the address of the Student class and referred to it
		//s1.getDetails()
		//looks like Student.getDetails(s1)
//		System.out.println(s1.getDetails());
//		System.out.println(s1.getGrade());
		
		System.out.println(Student.count);
//		System.out.println(s2.getDetails());

		
//		
	}

}

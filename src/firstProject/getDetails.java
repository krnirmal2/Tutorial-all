package firstProject;

public class getDetails {
	static String getDetail(String name, char gender, int roll, float marks) {
		String result = "";
		result = "name : "+ name +"\n"+
				 "Gender : "+ gender +"\n"+
				 "Roll : "+ roll +"\n"+
				 "Marks : "+ marks;
		
		return result;
	}
	
	static char getGrade(float marks) {
    	char grade;
    	if(marks<0 || marks>100) {
    		 grade ='I';
    	}
    	if(marks>=70) {
    		 grade ='A';
    	}
    	else if(marks>=60){
    		 grade ='B';
    	}
    	else if(marks>=40){
    		 grade ='C';
    	}
    	else {
    		grade ='F';
    	}
    	 return grade;
    }
	
	public static void main(String[] args) {
		String name = "Nirmal";
		char gender = 'M';
		int Roll = 10 ;
		float marks = 99.99f;
		System.out.println(getDetail(name,gender,Roll, marks));
		System.out.println(getGrade(marks));
		
				
				
	}

}

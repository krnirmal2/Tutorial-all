package firstProject;

public class Grade {
    static char grade(int marks) {
    	//char grade;
    	if(marks<0 || marks>100) {
    		return 'I'; // grade ='I'
    	}
    	if(marks>=70) {
    		return 'A';// grade ='A'
    	}
    	else if(marks>=60){
    		return 'B';// grade ='B'
    	}
    	else if(marks>=40){
    		return 'C';// grade ='C'
    	}
    	else {
    		return 'F';// grade ='F'
    	}
    	// return grade
    }
    
    public static void main(String[] args) {
		int marks =19;
		System.out.println(grade(marks));
	}
}

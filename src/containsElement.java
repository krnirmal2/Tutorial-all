import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import Student.Student;

public class containsElement {
    public static void main(String[] args) {
        
    
    List<Student> students = Arrays.asList( new Student("nirmal",'m',4,59),
                                            new Student("nirmal",'m',4,59)  );

    
    // System.out.println("enter roll");
    Scanner scanner = new Scanner(System.in);
    int roll = scanner.nextInt();
     //check that object contains in the are equal with the roll that take input and check
    // boolean isfound = students.contains(new Student("name", 'd', 5, 8));
    // System.out.println(isfound);

    boolean ispresent = false;
    for (Student student:students){
        if(student.Roll == roll);
        {
            ispresent=true;
            System.out.println(student.getDetails());
            break;
        }
        // if(!ispresent){
        //     System.out.println("studnet ");
        // }
    }
}
}
// }

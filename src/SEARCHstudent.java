import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import Student.Student;

public class SEARCHstudent {
    public static void main(String[] args) {
        HashMap<Integer, Student>map = new HashMap<>();
        map.put(20,  new Student("nirmal",'m',4,58));
        map.put(4,new Student("nirmal",'m',5,59));

        
             Scanner scanner = new Scanner(System.in);
             int roll = scanner.nextInt();

             boolean a = map.containsKey(roll);
             System.out.println(a);

    Student student = map.get(roll);
    if(student!=null){
        System.out.println(student.getDetails());

    }
    else{
        System.out.println("student not found");
    }
    
    Set<Integer>keys = map.keySet();
    Collection<Student> b = map.values();


    Set<Map.Entry<Integer,Student>> entries = map.entrySet();
    for(Map.Entry<Integer,Student> entry:entries){
        System.out.println(entry.getValue().Roll);
    }
    }


}

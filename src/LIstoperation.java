import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import Student.Student;

public class LIstoperation {
    

    public static void main(String[] args) {
    //     List<Integer> nos = Arrays.asList(4,1,3,4,5,6,23);

    //     // create a new list and store and then return the element which are odd and 
    //     // more then 3

    //     List<Integer> result = Arrays.asList();


         
    //     // nos.forEach(n->{
    //     //     if (n>3 && n%2!=0){
    //     //         result.add(n);
    //     //     }
    //     // });

    //     // System.out.println(result.stream());

    //     // most of the collection can be convert to tstream a
    //     // and apply the  no . operation on the data structure
    //     // a stream of integer object

    //    Stream<Integer> streams = nos.stream();

    //    int n[] = {94,5,64,345,6,4};
    
    //    IntStream is = Arrays.stream(n);//stream of integer values

    //    // build up streamsfrom specifiv values
    //    Stream<Integer> st =Stream.of(5,35,56,3,6);


    //    List<Integer> odds = st.filter(
    //     element->element %2!= 0  && element>3
    //    ).collect(Collectors.toList());

    // System.out.println(odds);

    // // String s = nos.stream().filter(element->element%2 ==0 && element>2).map(element-> element.toString()
    // // ).collect(Collectors.joining(","));


    // List<Integer> nd = nos.stream().filter(element-> element>4).
    // map(element -> element*element).
    // sorted((o1, o2) ->o2.compareTo(o1) ).collect(Collectors.toList());
      

    // System.out.println(nd);
    // // empty stream
    //    Stream stream1 = Stream.empty();






       // find the names of all the students comma 
    //    separated who have scored more than 80 marks

    List<Student> students = Arrays.asList(
    new Student("nirmal",'m',4,59),
    new Student("nirmal",'m',4,99) );

    String s = students.stream().filter(element->element.marks>80).map(
        element->element.name).collect(Collectors.joining(","));
    System.out.println(s);

    }
}

import java.util.Arrays;
import java.util.Collection;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import Student.Student;
import Student.Address.address;

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
    new Student("nirmal",'f',4,59, new address("mumbai", 12, "d", "l")),
    new Student("nirmal",'m',4,99) );

    String s = students.stream().filter(element->element.marks>80).map(
        element->element.name).collect(Collectors.joining(","));
    System.out.println(s);

    


    //find the average marks scord by all the students
    //
    double averageMarks = students.stream().collect(Collectors.averagingDouble(element->element.marks));
    
    System.out.println(averageMarks);
    // statistically data student
    DoubleSummaryStatistics d =students.stream().collect(Collectors.summarizingDouble(element->element.marks));
    
    System.out.println(d);


    Map<Character, List<Student>> mapGender = students.stream().collect(Collectors.groupingBy(element->element.gender));
    System.out.println(mapGender);

    // fromt he abohve student list make two groups of Students
    // 1. Scored more than or equal 59 marks
    //2. scored less than 80 marks

   Map<Boolean,List<Student>> partition_marks= students.stream().collect(Collectors.partitioningBy(element->element.marks>=59));

   System.out.println(partition_marks);


   //print the names of all students comma separated as a string who belong to the USA country



   students.stream().filter(element-> element.isAddressPrensent() && element.getAddress().getcountry().equals
   map(element->element.name)
   .collect(Collectors.joining(",")));


}
}
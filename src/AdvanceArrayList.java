import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AdvanceArrayList {
    public static void main(String[] args) {
        // List<Integer>nos = Arrays.aslist(4,245,6,456,6,45);
        List<Integer> nos = Arrays.asList(4,5,3,65,3);


        // so if we want to use arraylist like list we can pass the object  to
        // the constructor and use like
        LinkedList<Integer> l = new LinkedList<>(nos);
        System.out.println(l);

        System.out.println(nos);
        // below line check that what are the 
        System.out.println(nos.getClass());

        //print all the list element without using for loop
        //using lamda funciton
        nos.forEach(n->System.out.println(n));

        // print all the even no. without using for loop
        nos.forEach(n->{
            if(n%2==0){
                System.out.println(n);
            }
        });

        // method reference
        // passed as them as regular method
        System.out.println("$$$$$ all numbers ");
        // for shorting the lamda code to ::
        nos.forEach(System.out::println); 
    }
}

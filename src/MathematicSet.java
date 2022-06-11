import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class MathematicSet {
    public static void main(String[] args) {
        
    
    List<Integer> l1 = Arrays.asList(84,5,3,56,35);
    List<Integer> l2 = Arrays.asList(84,5,4,5,6,34,3,56,35);

    // convert list into set by passing the
    HashSet<Integer> h1 = new HashSet<>(l1);
    HashSet<Integer> h2 = new HashSet<>(l2);

    // cloning a hasset to modified with set which not reflect back to the 
    // original hasset h1
    // for that we have type cast the parent class to child cast
    HashSet<Integer> cloneh1 = (HashSet<Integer>) h1.clone();

    HashSet<Integer> cloneh2 = (HashSet<Integer>) h2.clone();

    // union
    cloneh1.addAll(h2);

    //intersection
    cloneh1 = (HashSet<Integer>)h1.clone();
    cloneh1.retainAll(cloneh2);
    // Systout.out.println(cloneh1);
    System.out.println(cloneh1);

    // ordering the elementt in the lindked list then we have to linkedhaset
    // LinkedHashSet<Integer> cloneh3 = (LinkedHashSet<Integer>) h1.clone();

    // LinkedHashSet<Integer> cloneh4 = (LinkedHashSet<Integer>) h2.clone();

    LinkedHashSet<Integer> cloneh5 = (LinkedHashSet<Integer>)h1.clone();
    System.out.println(cloneh5);

    }



}

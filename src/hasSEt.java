import java.util.Arrays;
import java.util.List;
import java.util.HashSet;

public class hasSEt {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(4,5,35,56,34);

        HashSet<Integer> has = new HashSet<>(l);
        System.out.println(has);

        HashSet<String> fruit = new HashSet<>();
        fruit.add("aaa");
        fruit.add("aaa");
        fruit.add("b");
        System.out.println(fruit);

    }




    
}

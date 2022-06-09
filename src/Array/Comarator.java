package Array;

import java.util.Comparator;

//package Array;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;

public class Comarator implements Comparator<Integer> {
	

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}
}

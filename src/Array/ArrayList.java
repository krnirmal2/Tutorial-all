package Array;

import java.util.Comparator;

public class ArrayList {
	
	public static void main(String[] args) {
//		java.util.ArrayList<Integer> ar= new ArrayList<>();
		java.util.ArrayList<Integer> ar = new java.util.ArrayList<>();
		ar.add(3);
		ar.add(33);
		ar.add(35);
		ar.add(345);
		ar.add(37);
		ar.add(37);
		ar.add(38);
		
		
		/*//inner class
		class Comarator implements Comparator<Integer> {
			

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		}
		
		ar.sort(new Comarator());
		*/
		//annonymous inner class
//		is help to pass the object of the comparator class and return the value
//		and sort the array return 
		// reduce the code and readiable
		
//		ar.sort(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o2.compareTo(o1) ;
//			}
//		});
		
		// above code again can be sorter by using 
		// Lamda expression
		
		//if a interface have more than one abstract method then lamda expression 
		// can't compare 
		// because lamda expression can only compare @FuncionalInterface annotate
		// function
		
		ar.sort((o1,o2)-> o2.compareTo(o1));
		
		
		
		
		System.out.println(ar) ;
		
		
		
	}
}

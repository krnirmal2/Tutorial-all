package StringClass;

public class StringClass {
	
	public static void main(String[] args) {
		// wrapper type is use ful to convert the string to any primitive type data
//		using wrapper class which are of object of class object
		
		
		
		
		
		
		
		
		
		// different common method use in day to day programming
		String obj = " hello world";
		String newStringGenerated = obj.toUpperCase();// newly created of previous obj character and not modified previous string
		String trimString = obj.trim();
		String replaceString = obj.replace("world", "all");
		obj.concat("hello");
		obj.compareTo(newStringGenerated);
//		System.out.println(obj.toCharArray());
//		System.out.println(obj.indexOf("ello"));
//		System.out.println(obj.substring(0,4));// start is inclusive and end exculusive
//		
		System.out.println(obj == trimString);//compare address of two strings 
		                                      //but there will some situation arise 
		                        // when there already some other variable contain same content
		 // that referred by the other string then it the second string point to that 
		//earlier string address and that's why the above statment give true rather it give false
		// note ---> we avoid == to compare between two strings we use equals() funciton
		System.out.println(obj.equals(trimString));// compare actual value represented by strings
		
		
		
				
	}

}

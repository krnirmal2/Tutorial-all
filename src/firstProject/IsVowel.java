package firstProject;

public class IsVowel {
	static boolean IsVowelExpression(char ch) {
		return switch(ch) {
		case 'a','e','i','o','u'->true;
		default->false;
		}
	}
	static boolean IsVowel(char ch) {
		// it switch block not a switch expression and in this swithc block we 
		// will fall through 
		switch(ch) {
		case 'a':			
		case 'e':				  
		case 'i':				  
		case 'o': 
		case 'u':
			return true;
		default:
			return false;
		   
		}
	}
	public static void main(String[] args) {
		char ch ='a';
//		System.out.println(IsVowel(ch));
		System.out.println(IsVowelExpression(ch));
	}

}

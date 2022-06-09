package firstProject;

public class evenSeries {
	static String evenSeriess(int n) {
		String result = "";
//		int i=0;
//		while(i<=n) {
//			if(i%2==0) {
//				result = result+i;
//				
//				if(i!=n) {
//					result = result+',';
//				}
//			}
//			i++;
//		}
		for(int i=0;i<=n ;i++) {
			if(i%2==0) {
				result = result+i;
				if(i!=n) {
					result =result+',';
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int n=10;
		System.out.println(evenSeriess(n));
	}
}

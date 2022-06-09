package firstProject;

public class evenNumber {
	int[] evenNumber(int num) {
		int []arr= new int[num] ;
		int i=0;
		while(num>=0) {
			
			if(num%2==0) {
				arr[i]=num;
			}
			num = num-2;
			i++;
			
			
		}
		return arr;
	}
	public static void main(String[] args) {
		int num =10;
		System.out.println(evenNumber(num));
	}

}

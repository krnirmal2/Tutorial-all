import Generic.WrapperArrayZeroOneBaseIndex;

public class WrapperRunner {
	
	public static void main(String[] args) {
		
		String cars[] = {"a", "b", "c"};
		
//		WrapperArrayZeroOneBaseIndex w = new WrapperArrayZeroOneBaseIndex(cars);
		
		WrapperArrayZeroOneBaseIndex<String> w = new WrapperArrayZeroOneBaseIndex(cars);
		
		
		String ele1 = w.get(3);
		String ele2 = w.set(2,"3");
		
		Integer no[]= {1, 43, 34 , 5};
		WrapperArrayZeroOneBaseIndex<Integer> arr = new WrapperArrayZeroOneBaseIndex(no);
		
		int e = arr.get(1);
		arr.set(2,19);
		
//		System.out.println(randomElement);
	}

}

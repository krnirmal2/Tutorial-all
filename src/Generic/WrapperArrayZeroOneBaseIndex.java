package Generic;

public class WrapperArrayZeroOneBaseIndex<T> {
	
//	String element[];
//	<T> element[];
	
	public T[] element;

	public WrapperArrayZeroOneBaseIndex(T element[]) {
		this.element = element;
	}
	
	public T get(int index) {
		return this.element[index-1];
	}
	
	public T set(int  index, T element) {
		return this.element[index-1] = element;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		for(int i=0;i<this.element.length;i++) {
			result += this.element[i];
			if(i!=this.element.length-1) {
				result +=",";
			}
			
		}
		return result;
	}

}

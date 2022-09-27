
public class MemoryLocation {
	
	String a = new String("hello");
	String b = new String ("hello");
	
	public boolean reference() {
		boolean isTrue = false;
		if(a.equals(b)) {
			isTrue = true;
		}else {
			isTrue = false;
		}
		return isTrue;
	}
	

	

}

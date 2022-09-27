
public class FizzBuzz {

	
	public void FizzTheBuzz() {
		
		for(int i = 1; i < 51; i++ ) {
			if(i % 3 == 0 && i % 5 == 0) {     //Multiples of 5 and 3
				System.out.println("FizzBuzz");
			}
			else if(i % 3 == 0) {              //Multiples of 3
				System.out.println("Fizz");
			}else if(i % 5 == 0) {             //Multiples of 5
				System.out.println("Buzz");
	
			}else {
				System.out.println(i);
			}
		}
	}
}

import java.util.Scanner;

public class TenNumbers {

	
	public void addNumbers() {
		
		int sum= 0;
		double average = 0;
		int[] myArray = new int[10];
		
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter 10 numbers, press enter after every entry");
		
		for(int i = 0; i < 10; i++) {
			myArray[i] = myObj.nextInt();  // Read user input
			sum += myArray[i];			   //adds the total
		}
		
		average = sum / 10; // gets the average
		
		System.out.println("The sum is: " + sum + " and the average is: " + average);
		System.out.println("The Minimum is: " + min(myArray));
		System.out.println("The Maximum is: " + max(myArray));
	}
	
	 public int min(int [] array) {
		 int minimum = array[0];
		 
		 for(int i = 1; i < array.length; i++) {
			 if(array[i] < minimum) {
				 minimum = array[i];
			 }
		 }
		 
		 return minimum;
	 }
	 
	 public int max(int [] array) {
		 int maximum = array[0];
		 
		 for(int i = 1; i < array.length; i++) {
			 if(array[i] > maximum) {
				 maximum = array[i];
			 }
		 }
		 
		 return maximum;
	 }
	 
	 
	 
	 
}

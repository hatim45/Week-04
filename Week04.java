package week04;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.w3c.dom.css.Counter;

public class Week04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
//
//		a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
//		sys
		//System.out.println(ages[7]-ages[0]);
		//System.out.println(ages.length-1);
		System.out.println(ages[ages.length-1]-ages[0]);
		
//		b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 99};
		
//		i. Make sure that there are 9 elements of type int in this new array.  
//
//		ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		System.out.println(ages2[ages2.length-1]-ages2[0]);
//		iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
//
//		c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
		 double sum = 0;
		for (int age : ages) {
			sum += age; 
		} System.out.println(sum/(ages.length));
//
//		2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String[] names = {"Sam ", "Tommy ", "Tim ", "Sally ", "Buck", "Bob"};
//
//		a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//		fo
		double sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
			
		}

		System.out.println(sumOfLetters/(names.length));
		
//		b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String nameConcatentate = "";
		for (int i = 0; i < names.length; i++) {
			nameConcatentate += names[i]+" ";
		}
		System.out.println(nameConcatentate);

//		3. How do you access the last element of any array?
		/// you access the last element by typing the name of the Array.(length-1) into System.out.println
		
		
//
//		4. How do you access the first element of any array?
		/// you access the first element by typing the name of the Array.(0) into System.out.println
		 
//
//		5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
//
		 int[] nameLengths = new int[names.length];
		 for(int i = 0; i < names.length; i++){
		     nameLengths[i] = names[i].length();
		 }
		 System.out.println(Arrays.toString(nameLengths));
		 
//		6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
//
		 int sum3 = 0;
		 for (int i = 0; i < nameLengths.length; i++) {
			 sum3 += nameLengths[i];
		 }
		 System.out.println(sum3);
	
}// End of Main	
		 
		 
		 
//		7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 public static String repeatWord (String word, int n) {
			 String result = "";
			 for (int i = 0;i <= n; i++) {
				 result += word;
			 }
			 return result;
			 }
		 
		 

		 
//
//		8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
		}
	
//	
//		9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		public static boolean greaterThanHundo(int[] array) {
			int arraySum = 0;
			for( int i =0; i < array.length; i++) 
			{arraySum = arraySum + array[i];
		}	
			if (arraySum > 100) {
			return true;
			
		} 
			else return false;
			}
//
//		10. Write a method that takes an array of double and returns the average of all the elements in the array.
		public static double averageDouble(double[] numbers) {
	    int sum = 0;
	    for (int i = 0; i < numbers.length; i++) {
	    	  sum += sum + numbers[i];
		}
	    return sum/numbers.length;
	    }
		
		
//
//		11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		public static boolean averageOfTwo(double[]first, double[] second) {
//			int sum1 = 0;
//			int sum2 = 0;
//		    for (int i = 0; i < first.length; i++) {
//		    	  sum1 += sum1 + first[i];
//		}	
//		    for (int i = 0; i < second.length; i++) {
//	    	  sum2 += sum2 + second[i];
//		} 
//		    double average1 = (sum1/first.length);
//		double average2 = (sum2/second.length);
//		
//		if (average1 > average2) {
//			return true;
//			
//		}
		return (averageDouble(first) > averageDouble(second));
		}
		
				
//
//		12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			return (isHotOutside= true && moneyInPocket > 10.50);
		}





private static void If(boolean b) {
	// TODO Auto-generated method stub
	
}






		
//
//		13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	public static boolean greaterThanZero(double number) {
		if (number > 0) {
			return true;
		} else return false;
		}// this shows if you are dealing with a positive number





}// End of Class

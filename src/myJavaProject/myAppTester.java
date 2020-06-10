 /**
 * Software Engineering - Summer 2020 
 */
package myJavaProject;

import java.util.Scanner;
public class myAppTester {
	
 public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
	  int n=0;
	  System.out.println("Hello Software Engineering World");
	  System.out.println("Input your number and press enter: ");
	  n = input.nextInt();
	  System.out.print("Reverse of the input number is: ");
	  reverseMethod(n);
	  System.out.print("The sum of all those digits is: ");
	  myTestMethod(n);
	  System.out.println();

	  // add a line below to call your myTestMethod from here  then remove the block comment symbols  

	}
	
	//This is a method to reverse the number by recursion
	public static void reverseMethod(int num) {
	       if (num < 10) {
		   System.out.println(num);
		   return;
	       }
	       else {
	           System.out.print(num % 10);
	           reverseMethod(num/10);     // recursive call
	       }
	   }


	    
	//add your test method in this space then remove the block comment symbols
	//method to get sum of all digits entered
	public static void myTestMethod(int num){
			int sum =0;
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			
			   System.out.println(sum);
			  
	}
            
	 
	   

}

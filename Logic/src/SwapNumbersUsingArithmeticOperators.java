import java.util.Scanner;

public class SwapNumbersUsingArithmeticOperators {
	public static void main(String[] args) {

		int a,b,t;
		 System.out.println("Enter the number a: ");
		 Scanner sc = new Scanner(System.in);
		 a = sc.nextInt();
		 System.out.println("Enter the number b: ");
		 b = sc.nextInt();
		 
		 a=a*b;
		 b=a/b;
		 a=a/b;
		 System.out.println("Values after swapping a="+a+" and b="+b);
	}
	
	
	
}

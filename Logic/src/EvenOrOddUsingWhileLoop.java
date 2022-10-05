import java.util.Scanner;

public class EvenOrOddUsingWhileLoop {

	public static void main(String[] args) {
		int Number;
		 System.out.println("Enter the number: ");
		 Scanner sc = new Scanner(System.in);
		 Number = sc.nextInt();
		 while(	Number>2) {
			 Number=Number-2;
		 }
		 if(Number==2)
		 System.out.println("Number is even");
		 else
		 System.out.println("Number is odd");

	}

}

import java.util.Scanner;

public class Fibonacci {
	public static void Fibonacci(int N)
	 {
	 int num1 = 0, num2 = 1;
	 
	 int counter = 0;
	while (counter < N) 
	 {
	 
	 System.out.print(num1 + " ");
	 
	 // Swaping
	 int num3 = num2 + num1;
	 num1 = num2;
	 num2 = num3;
	 counter = counter + 1;
	 }
	 }
	 
	 public static void main(String args[])
	 { int N;
	 
	 Scanner sc = new Scanner(System.in); 
	 System.out.print("Enter the number: "); 
	 N = sc.nextInt();
	 Fibonacci(N);
}
}

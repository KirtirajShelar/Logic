import java.util.Scanner;

public class EvenOrOdd {
public static void main(String[] args) {
	int Number;
	 System.out.println("Enter the number: ");
	 Scanner sc = new Scanner(System.in);
	 Number = sc.nextInt();
	 if(Number/2*2==Number)
	 System.out.println("Number is even");
	 else
	 System.out.println("Number is odd");
}
}

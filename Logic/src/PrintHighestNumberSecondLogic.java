import java.util.Scanner;

public class PrintHighestNumberSecondLogic {
public static void main(String[] args) {
	int a,b,c;
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("Enter the first number :");
	 a = sc.nextInt();
	 System.out.print("Enter the second number :");
	 b = sc.nextInt();
	 System.out.print("Enter the third number :");
	 c = sc.nextInt();

	
	if(a>b)
	 b=a;
	 if(c>b)
	 b=c; 
	System.out.println(b+" is highest number");

}
}
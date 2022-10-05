import java.util.Scanner;

public class PrintHighestNumber {
	public static void main(String args[])
	 { int a,b,c;
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("Enter the first number :");
	 a = sc.nextInt();
	 System.out.print("Enter the second number :");
	 b = sc.nextInt();
	 System.out.print("Enter the third number :");
	 c = sc.nextInt();
	 
	if(a>b)
	{
	  if(a>c)
	  System.out.println(a+" is highest");
	  else
	  System.out.println(c+" is highest");
	}
	else
	{
	  if(b>c)
	  System.out.println(b+" is highest number");
	  else
	  System.out.println(c+" is highest number");
	}
 }
}

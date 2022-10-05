import java.util.Scanner;

public class HighestNumber {
public static void main(String[] args) {
	int no, max,i;
	Scanner sc = new Scanner(System.in); 
	 System.out.print("Enter the number: "); 
	 no = sc.nextInt();
	 max=no;
	 for(i=1;i<=10;i++)
	{
	System.out.println("Enter number: ");
	no = sc.nextInt();
	if(max<no)
	 max=no;
	}
	 System.out.println("Highest number is "+max);
}
}

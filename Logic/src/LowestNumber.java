import java.util.Scanner;

public class LowestNumber {
public static void main(String[] args) {
	
	int no, min,i;
	Scanner sc = new Scanner(System.in); 
	System.out.print("Enter the number: "); 
	no = sc.nextInt();
	min=no;
	for(i=1;i<=10;i++)
	{
	System.out.println("Enter number: ");
	no = sc.nextInt();
	if(min>no)
	 min=no;
	}
	System.out.println("The lowest number is "+min);
  }
}

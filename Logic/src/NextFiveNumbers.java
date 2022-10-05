import java.util.Scanner;

public class NextFiveNumbers {
public static void main(String[] args) {
	int no,i;
	Scanner sc = new Scanner(System.in); 
	 System.out.print("Enter the number: "); 
	 no = sc.nextInt();
	 no=no+1;
	 for(i=no;i<(no+5);i++)
	 {
	 System.out.print(i+" "); 
	 }
}
}


import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks");
		int mark=scan.nextInt();
		if(mark>=50 && mark<=60)
		{
			System.out.println("Pass");
		}
		else if(mark>60 &&mark<=70)
			{
				System.out.println("Fisrt Division");
				
			}
		else if(mark>70)
			{
				System.out.println("Distinction");
				
			}
			else
			{
				System.out.println("Fail");
			}

	}

}

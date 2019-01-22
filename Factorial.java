import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any no:");
		int s=sc.nextInt();
		for(int i=1;i<=s;i++)
		{
			f=f*i;
		}
		System.out.println(f);
		

	}

}

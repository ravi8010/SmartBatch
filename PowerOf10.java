import java.util.Scanner;
public class PowerOf10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		while(n>1)
		{
			r=n%10;
			n=n/10;
			if(r!=1)
			{
				break;
			}
			
		}
		if(n==1&&r==0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		
		

	}

}

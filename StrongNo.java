import java.util.Scanner;
public class StrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,n,s=0;
		int i,f=1,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		n=sc.nextInt();
		t=n;
		while(n!=0)
		{
			r=n%10;
			for(i=1;i<=r;i++)
			{
				f=f*i;
				
			}
			s=s+f;
			n=n/10;
			f=1;
		}
		
		if(s==t)
		{
			System.out.println("is strong no");
		}
		else
		{
			System.out.println("not");
		}
		

	}

}

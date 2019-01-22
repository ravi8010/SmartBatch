import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s,e,c,i,j;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter start:");
		s=sc.nextInt();
		
		System.out.println("Enter end:");
		e=sc.nextInt();
		for(i=s;i<=e;i++)
		{
			c=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					c++;
					break;
				}
			}
			if(c==0)
			{
				System.out.print(i+" ");
			}
		}

	}

}

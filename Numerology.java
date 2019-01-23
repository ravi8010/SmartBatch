import java.util.Scanner;
public class Numerology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,s1=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		char[] ar=s.toUpperCase().toCharArray();
		int n=0;
		for(i=0;i<ar.length;i++)
		{
			if(ar[i]=='A'||ar[i]=='I'||ar[i]=='j'||ar[i]=='Q'||ar[i]=='Y')
			{
				n=n+1;
			}
			if(ar[i]=='B'||ar[i]=='K'||ar[i]=='R')
			{
				n=n+2;
			}
			if(ar[i]=='C'||ar[i]=='G'||ar[i]=='L'||ar[i]=='S')
			{
				n=n+3;
			}
			if(ar[i]=='D'||ar[i]=='M'||ar[i]=='T')
			{
				n=n+4;
			}
			if(ar[i]=='E'||ar[i]=='H'||ar[i]=='N'||ar[i]=='X')
			{
				n=n+5;
			}
			if(ar[i]=='U'||ar[i]=='V'||ar[i]=='W')
			{
				n=n+6;
			}
			if(ar[i]=='F'||ar[i]=='P')
			{
				n=n+8;
			}
			if(ar[i]=='O'||ar[i]=='Z')
			{
				n=n+7;
			}
		}
		int num=n;
			while(num!=0)
			{
				int r=num%10;
				s1=s1+r;
				num=num/10;
				
			}
			
			System.out.println("sum is:"+s1);
			
			
			
		}
	

		

	}



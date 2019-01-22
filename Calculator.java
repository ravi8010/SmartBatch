import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int a,b,c,n;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter first no:");
		a=sc.nextInt();
		System.out.println("Enter Second no:");
		b=sc.nextInt();
		System.out.println("Calculator:");
		System.out.println("1:Addition");
		System.out.println("2:Subtraction");
		System.out.println("3:Multiplication");
		System.out.println("4:Division");
		System.out.println("5:EXIT");
		System.out.println("Enter your Choice:");
		n=sc.nextInt();
		
		
		switch(n)
		{
	case 1:
		c=a+b;
		System.out.println(c);
		break;
	case 2:
		c=a-b;
		System.out.println(c);
		break;
	case 3:
		c=a*b;
		System.out.println(c);
		break;
	case 4:
	float d=(float)a/b;
		System.out.println(d);
		break;
	case 5:
	
		System.out.println("EXIT");
		break;
	default:
		 System.out.println("Wrong Option");
		return;
	    }
	}
	}
}

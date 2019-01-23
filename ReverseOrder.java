import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String[] b=a.split(" ");
		int l[]=new int[10];
        for(int i=0;i<b.length;i++) {
        	l[i]=b[i].length();
        }
        char x[]=a.toCharArray();
        String d="";
        for(int i=a.length()-1;i>=0;i--)
        {
        	if(x[i]!=' ')
        	   d=d+x[i];
        }
        String temp="";
        int m=0;
        for(int i=0;i<d.length();) {
        	for(int j=0;j<l[m];j++)
        	{
                       temp=temp+d.charAt(j); 
                       i++;
        	}
        	temp=temp+" ";
        	m++;
	}

 }
}
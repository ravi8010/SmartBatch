import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		boolean status=true;
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		if(s1.length()==s2.length())
		{
			status=false;
		}
		char[] ArrayS1 = s1.toLowerCase().toCharArray();  
        char[] ArrayS2 = s2.toLowerCase().toCharArray();
        Arrays.sort(ArrayS1);
        Arrays.sort(ArrayS2);
        status = Arrays.equals(ArrayS1, ArrayS2);  
        if(status)
        {
        	System.out.println("ANagram");
        }
        else
        {
        	System.out.println("not Anagram");
        }
		
		
		

	}

}

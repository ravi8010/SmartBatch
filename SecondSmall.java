
import java.util.Scanner;

public class SecondSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the array");
	        int[] a=new int[5];
	        
	        for(int i=0;i<5;i++)
	        {
	        	a[i]=sc.nextInt();
	        }
	        int temp;
	        for(int i=0; i < 5; i++){  
	            for(int j=1; j < (5-i); j++){  
	                     if(a[j-1] > a[j]){  
	                            //swap elements  
	                            temp = a[j-1];  
	                            a[j-1] = a[j];  
	                            a[j] = temp;  
	                    }  
	                     
	            }
	        }
	       System.out.println("the Second smallest no is:"+a[1]);
	       sc.close();
	}

}

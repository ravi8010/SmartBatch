
public class WeightString {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int i,s1=0;
		String s="Apple";
		
		char[] ar=s.toLowerCase().toCharArray();
		  for(i=0;i<ar.length;i++)
		  {
			  if(ar[i]>='a'&&ar[i]<='z')
			  {
				  s1=s1+ar[i]-96;
				  
			  }
				
		  }
		  System.out.println(s1);  

	}

}

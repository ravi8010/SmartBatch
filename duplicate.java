class DuplicateWords
{
 public static void main(String args[])
{
int i,j,k;
   String word="day say day say me say me";
   String[] swrd=word.split(" ");
   for(i=0;i<swrd.length;i++)
     {
      if(swrd[i]!=null)
        {
		for(j=i+1;j<swrd.length;j++)
                  {
			if(swrd[i].equals(swrd[j]))
			{
				swrd[j]=null;
			}
                  }
        }   
  
     }
 
     for(k=0;k<swrd.length;k++)
        {
          if(swrd[k]!=null)
           {
	   System.out.println(swrd[k]);
            }
        }
}


}
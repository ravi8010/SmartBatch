
		class Perfect
		{        public static void main(String ar[])

		          {

		                   int i,sum=1;                  

		                   System.out.print("Perfect nos from 1 to 100 are ");

		                   for(int j=2;j<=60;j++)

		                   {

                         		  sum=1;

		                       for(i=2;i<j;i++)

		                       {     if(j%i==0)

		                             sum=sum+i;

		                       }

		                   if(j==sum)

		                             System.out.print(j+",");

		                   }

		          }

		

	}



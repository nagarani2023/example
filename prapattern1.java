class Main
{
 public static void main(String[] args)
   {
     int rows=5,cols=5;
      for(int r=1;r<=rows;r++)
	{
	  for(int c=1;c<=rows;c++)
		{
		  if(c==1||r==1||r+c==rows+1)
		  System.out.print("# ");
			else
			  System.out.print("  ");
		}
		  System.out.println();
	}
		for(int r=2;r<=rows;r++)
		   {
			for(int c=1;c<=rows;c++)
			    {
				if(r==rows||c==1||r==c)
				System.out.print("# ");
				  else
				System.out.print("  ");
			    }
				System.out.println();
		   }
		  
   }
}

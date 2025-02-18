class Main
{
 public static void main(String[] args)
   {
     int rows=5,cols=5;
      for(int r=1;r<=rows;r++)
	{
	  for(int c=1;c<=r;c++)
		{
		  System.out.print("# ");
		}
		  System.out.println();
	}
		for(int r=2;r<=rows;r++)
		   {
			for(int c=r;c<=rows;c++)
			    {
				System.out.print("# ");

			    }
				System.out.println();
		   }
		  
   }
}

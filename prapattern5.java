class Main
{
 public static void main(String args[])
   {
	int rows=5;
	for(int r=1;r<=rows;r++)
	  {
            for(int c=1;c<=r;c++)
		{
		  System.out.print("  ");
		}
		  for(int z=rows;z>=r;z--)
			{
			  if(r==1||r==z||z==rows)
			System.out.print("$ ");
			   else
			System.out.print("  ");
			}
                         System.out.println();
   	}
  }
}

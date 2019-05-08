import java.io.*;
import java.io.IOException;
class abc
{
  public static void main(String args[])
  {
  try{
       System.out.println("Before call");
	   subabc();
	 }
	 catch(ArithmeticException e)
	 {
	   System.out.println("Inside main class");
	 }
	 finally
	 {
		 System.out.println("finally inside the main class");
	 }
  }
	public static void subabc()
	{
    try
	{
	  int i=1;
	  int j=0;
	  System.out.println("Before division");
	  int z=i/j;
	  System.out.println("After division");
	}
	catch(ArithmeticException e)
	{
	  System.out.println("Arithmetic Exception"+e);
	  throw e;
	}
	finally
	{
	  System.out.println("Inside finally class");
	}
  }
}

 
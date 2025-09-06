public class recursion1
{
    public static void main(String ss[])
	{
	   int count = 0;
	   func(count);
	}
	
	
	public static void func(int count)
	{ 
	   //base case
	   if(count == 4)
	   {
	      return;
	   }
	   
	   System.out.println(count);
	   count++;
	   
	   func(count);
	
	
	}
}
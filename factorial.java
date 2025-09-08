public class factorial
{
   public static void main(String ss[])
   {
      int n = 5;
	  
	 int ans =  solve(n);
	 System.out.println("Factorial of "  +  n + " is " + ans );
   }
   
   public static int solve(int n)
   {
      if(n == 1)
	  {
	    return 1;
	  }
	  
	  
	  int ans = n*solve(n-1);
	  return ans;
	  
	  
	  
	  
   
   }


}
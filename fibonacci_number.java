// functional recursion.....

import java.util.*;

public class fibonacci_number
{
   public static void main(String ss[])
   {
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
	  
	 int ans =  solve(n);
	 System.out.println("Fibonacci value of the n is ---> " + ans);
   }
   
   
   public static int solve(int n)
   {
      if(n <= 1)
	  {
	     return n;
	  }
   
      int last = solve(n-1);
	  int slast = solve(n-2);
	  
	  int ans = last+slast;
	  return ans;
   
   
   }


}
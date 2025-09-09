public class power_of_number
{
   public static void main(String ss[])
   {
      int x = 2;
	  int n = 9;
	  int ans = solve(x,n);
	  System.out.println(ans);
   }
   
   public static int solve(int x ,int n)
   {
      if(n == 1)
	  {
	    return x;
	  }
	  
	  return x * solve(x,n-1);
	 
      
   
   }
}
public class print_n_to_1
{
   public static void main(String ss[])
   {
      int n = 10;
	  
	  solve(n);
   }
   
   public static void solve(int n)
   {
      if(n == 0)
	  {
	    return;
	  }
	  
	  
	  System.out.println(n);
	  solve(n-1);
	  
   }
}
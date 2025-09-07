public class print_n_to_1_backtracking
{
   public static void main(String ss[])
   {
      int n = 10;
	  int i = 1;
	  solve(i,n);
   }
   
   public static void solve(int i,int n)
   {
      if(i > n)
	  {
	    return;
	  }
	  
	  solve(i+1,n);
	  System.out.print(i+" ");
   }
}
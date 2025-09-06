public class print_to_1
{
   public static void main(String ss[])
   {
      int n = 10;
	  int i = n;
	  solve(i,n);
   }
   
   
   public static void solve(int i , int n)
   {
      if(i < 1)
	  {
	     return;
	  }
	  
	  System.out.print(i+" ");
	  
	  solve(i-1,n);
	  
	  
   
   }

}
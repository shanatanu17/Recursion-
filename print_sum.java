public class print_sum
{
   public static void main(String ss[])
   {
      int n = 30;
	  int i = 21;
	  int sum  =0;
	  solve(i,n,sum);
   }
   
   public static void solve(int i,int n,int sum)
   {
    if(i > n)
	{
	   System.out.println(sum);
	   return;
	}
   
   
     sum = sum + i;
	 solve(i+1,n,sum);
	 
   }

}
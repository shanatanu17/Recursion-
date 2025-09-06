public class print_to_n
{
    public static void main(String ss[])
	{
	   int n  = 100;
	   solve(1,n);
	}
	
	public static void solve(int i,int n)
	{
	   if(i > n)
	   {
	      return;
	   }
	   
	   System.out.print(i+" ");
	   
	   solve(i+1,n);
	
	}
}
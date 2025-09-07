public class print_1_to_n_backtracking
{
    public static void main(String ss[])
	{
	    
		int n = 3;
		solve(n,n);
	}
	
	public static void solve(int i,int n)
	{
	   if(i < 1)
	   {
	     return;
	   }
	   
	   solve(i-1,n);
	   System.out.print(i+" ");
	}
}
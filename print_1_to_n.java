public class print_1_to_n
{
  public static void main(String ss[])
  {
    
	int n = 10;
	
	solve(1,n);
  }
  
  public static void solve(int i,int n)
  {
    if(i > n)
	{
	   return;
	}
	
	System.out.println(i);
	solve(i+1,n);
    
  
  }
}
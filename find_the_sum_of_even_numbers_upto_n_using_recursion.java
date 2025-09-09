public class find_the_sum_of_even_numbers_upto_n_using_recursion
{
   public static void main(String ss[])
    {
       int n = 10;
       int i = 1;
       int sum = 0;

      int ans  = solve(i,n,sum);
      System.out.println(ans);
    }

    
    public static int solve(int i,int n,int sum)
     {
        if(i > n)
         {
            return sum;
         }

 
        if(i % 2 == 0)
        {
           sum = sum + i;
        }
 
        
       return solve(i+1,n,sum);
 
 
     }
 
}
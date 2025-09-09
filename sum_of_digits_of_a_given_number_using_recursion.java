public class sum_of_digits_of_a_given_number_using_recursion
{
  public static void main(String ss[])
   {
       int n = 1234569;
       int sum = 0;
       int ans = solve(n,sum);
       System.out.println(ans);
   }

 public static int solve(int n,int sum)
 {
   if(n == 0)
    {
       return sum;
    }

    
   int ld = n % 10;
   sum =sum + ld;
   n = n/ 10;

   return solve(n,sum);
 }


}
public class sum_of_all_multiples_of_3_or_5_up_to_n_using_recursion
{
   public static void main(String ss[])
    {
      int n = 20;
      int i = 1;
      int sum = 0;

     int ans = solve(n,i,sum);
     System.out.println(ans);
    }


    public static int solve(int n,int i,int sum)
     {
        if(i > n)
         {
            return sum;
         }

 
        if(i % 3 == 0)
         {
           sum = sum + i;
         }

        if(i % 5 == 0)
         {
            sum = sum + i;
         }

         return solve(n,i+1,sum);
     }


}
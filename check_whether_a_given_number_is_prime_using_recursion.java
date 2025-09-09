public class check_whether_a_given_number_is_prime_using_recursion
{
   public static void main(String ss[])
   {
      
      int n = 17;
      int i =1;
      int count = 0;
      int ans = solve(i,n,count);

      
      
       if(ans > 2)
        {
           System.out.println("It is not prime no");
        }
       else
        {
           System.out.println("It is prime no");

        }
   }


    public static int solve(int i,int n,int count)
     {
        if(i > n)
         {
            return count;
         }

 
         if(n % i == 0)
          {
             count++;
          }

        return solve(i+1,n,count);
 
  
     }

}
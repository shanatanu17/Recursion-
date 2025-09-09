public class product_of_digits_of _a_given_number_using_recursion
{
   public static void main(String ss[])
    {
      int n  =123;
      int mul = 1;
      int ans = solve( n ,  mul);
      System.out.println("Multiplication of digits in no is " + ans);
     }

  
   public static int solve(int n,int mul)
    {
        if(n == 0)
         {
           return mul;
         } 

        
        int ld = n % 10;
        mul = mul * ld;
        n = n / 10;
        
        return solve(n,mul);
    }


}
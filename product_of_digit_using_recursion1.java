public class product_of_digit_using_recursion1
{
   public static void main(String ss[])
    {
      int n  =987;
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
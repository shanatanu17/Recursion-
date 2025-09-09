public class print_the_digits_of_a_number_in_reverse_order_using_recursion
{
   public static void main(String ss[])
    {
      int n = 987654;
      solve(n);
    }

 
   public static void solve(int n)
    {
      if(n == 0)
       {
          return;
       }

 
      int ld = n % 10;
      n = n / 10;

      System.out.println(ld);
      solve(n);
    }

}
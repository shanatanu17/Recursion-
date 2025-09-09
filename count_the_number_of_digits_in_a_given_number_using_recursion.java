public class count_the_number_of_digits_in_a_given_number_using_recursion
{
   public static void main(String ss[])
    {
       int no = 8080192;
       int count=0;

       int ans = solve(no,count);
       System.out.println("NO of digits in a no is "  + ans);
    }

    
    public static int solve(int no , int count)
     {
       if(no == 0)
       {
         return count;
       }

       
       count = count + 1;
       no = no/10;

       return solve(no,count);
     }
}
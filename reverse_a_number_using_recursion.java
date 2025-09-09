public class reverse_a_number_using_recursion
{
  public static void main(String ss[])
    {
       int no = 890234;
       int rev = 0;

       int ans = solve(no,rev);
       System.out.println("  reverse of a no is "  + ans);
    }

 
  public static int solve(int no, int rev)
 {
     if(no == 0)
      {
         return rev;
      }

      
     int ld = no % 10;
     rev = rev * 10 + ld;
     no = no / 10;

     return solve(no,rev);
 }

    
    


}
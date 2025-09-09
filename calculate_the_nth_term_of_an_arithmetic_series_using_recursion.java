public class  calculate_the_nth_term_of_an_arithmetic_series_using_recursion
{
   public static void main(String ss[])
    {
       int a = 100;
       int d = 10;
       int n = 8; 
       int val = a;

       int ans = solve(a,d,n,val);
       System.out.println("Nth term of arithmatic series is " + ans);
    }

    
    public static int solve(int a,int d,int n,int val)
     { 
       if(n == 1)
        {
           return val;
        }

 
       val = val+d;
       n = n -1;

       return solve(a,d,n,val);
     }

}
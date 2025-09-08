import java.util.*;

public class print_subsequences_whos_sum_is_k
{
   public static void main(String ss[])
   {
      int arr[]= new int[]{1,2,1};
	  ArrayList<Integer> list = new ArrayList<>();
	  
	  int n = arr.length;
	  int sum = 2;           // this sum we have to check , is subsequence of this sum is present 
	  int ind = 0;
	  int s = 0;            // in this var , we store the current sum
	  
	  solve(ind,arr,list,n,sum,s);
   }
   
   public static void solve(int ind ,int arr[] , ArrayList<Integer> list , int n , int sum,int s)
   {
      if(ind == n)
	  {
	     if(s == sum)
		 {
		    for(int i=0;i<list.size();i++)
			{
			   System.out.print(list.get(i)+" ");
			}
			System.out.println();
		 }
		 return;
	  }
	  
	  
	  // take(Add in list)
	  list.add(arr[ind]);
	  s =  s + arr[ind];
	  solve(ind+1,arr,list,n,sum,s);
	  
	  
	  //not take
	  list.remove(list.size()-1);
	  s = s - arr[ind];
	  solve(ind+1,arr,list,n,sum,s);
	 
   
   
   }

}
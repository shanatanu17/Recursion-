import java.util.*;

public class print_subsequences
{
   public static void main(String ss[])
   {
      int arr[] = new int[]{3,1,2};
	  int n = arr.length;
	  int idx = 0;
	  
	  ArrayList<Integer> list = new ArrayList<>();
	  
	  solve(idx,list,arr,n);
   }
   
   
   public static void solve(int idx ,ArrayList<Integer> list, int arr[],int n)
   {
      if(idx == n)
	  {
	     for(int val : list)
		 {
		    System.out.print(val+" ");
		 }
		 
		 if(list.size() == 0)
		 {
			 System.out.println("{}");
		 }
		 System.out.println();
	     return;
	  }
	  
	  
	  
	  // take/pick the particular element in list
	  list.add(arr[idx]);
	  
	  solve(idx+1,list,arr,n);
	  
	  
	  list.remove(list.size() - 1);
	  
	  // not take the particular element in list
	  solve(idx+1,list,arr,n);
	  
	  
	  
	  
      
   }
}
import java.util.Scanner;
public class ActivityAssign {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
     //  System.out.println("Enter the array size");
       int n=sc.nextInt();
       int a[]=new int[n];
       int count=0;
    //   System.out.println("enter the array");
       for(int i=0;i<n;i++)
       {
    	   a[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++)
       {
//    	   System.out.println(a[i]);
       }
       /*
//		System.out.println("enter p");
		int p=sc.nextInt();
		*/
        for(int i=0;i<n;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		for(int k=j+1;k<n;k++)
        		{
        			int sum=a[i]+a[j]+a[k];
              if(sum==0)
              {
            	  count =count+1;
        	  }
        		}
        	}
        }
        System.out.println(count);
	}

}

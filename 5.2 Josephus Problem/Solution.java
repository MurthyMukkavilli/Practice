import java.util.Scanner;

class Node1
{
	Object data;
	Node1 next;
	Node1(int data)
	{
		this.data=data;
		next=null;
	}
}
class Queue1
{
	Node1 head;
	Node1 tail;
	boolean isempty()
	{
		return head==null;
	}
	void Queue(int data)
	{
		Node1 n=new Node1(data);
		if(isempty())
		{
			head=tail=n;
			
		}
		else
		{
			tail.next=n;
			tail=tail.next;
		}
				
	}
	int Dequeue()
	{
		Node1 temp=head;
		
		if(isempty())
		{
			System.out.println("No elements");
		}
		else
		{
		head=temp.next;
		}
		return (int)temp.data;
	}
	
}
public class Solution{

	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in); 
		 int k=sc.nextInt();
		 while(sc.hasNext())
		 {
	        int m = sc.nextInt();
	        int n= sc.nextInt();

	        // initialize the queue
	        Queue1 l =  new Queue1(); 
	        for (int i = 0; i < m; i++)
	        {
	            l.Queue(i);
	        }

	      while (!l.isempty()) 
	      {
		for (int i = 0; i < m-1; i++)
	        {
	            for (int j = 0; j < n-1; j++) 
	            {
	                l.Queue(l.Dequeue());
	            }
	           System.out.print(l.Dequeue()+" ");
	        } 
			l.Queue(l.Dequeue());
	       System.out.print(l.Dequeue());
	        System.out.println();
	        k++;
		 }
	    }

}
}

public class Main_Linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		for(int i=0;i<5;i++)
		{
			DataItems data=new DataItems(i,"Data"+i);
			ll.insertNode(data);
		}
		System.out.println("\n");
	
     ll.displayList();
	}
}

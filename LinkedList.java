
public class LinkedList {
HeadNode head;

public LinkedList()
{
	head =  new HeadNode();
}
public void insertNode(DataItems data)
{
	Node newNode=new Node();
	newNode.setDataItems(data);
	Node nextNode=head.getNextNode();
	head.setNextNode(newNode);
	newNode.setNextNode(nextNode);	
}
public void deleteNode()
{
	Node delete=head.getNextNode();
	if(delete!=null)
	{
		Node nextNode=delete.getNextNode();
		head.setNextNode(nextNode);
		delete.setNextNode(null);
	}
	else
	{
		System.out.println("No nodes");
	}
}
public void displayList()
{
	Node nodes=head.getNextNode();
	int i=0;
	while(nodes!=null)
	{
		DataItems data=(DataItems) nodes.getDataItems();
		System.out.println("Node"+i+":"+data.toString());
		nodes=nodes.getNextNode();
		i++;
	}
}

}

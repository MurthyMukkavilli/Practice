
public class Node<DataItems> {
	private DataItems dataItems;
	private Node nextNode;
	
	public Node getNextNode() 
	{
		return nextNode;
	}
	public void setNextNode(Node nextNode)
	{
		this.nextNode = nextNode;
	}
	public DataItems getDataItems() 
	{
		return dataItems;
	}
	public void setDataItems(DataItems dataItems) 
	{
		this.dataItems = dataItems;
	}

}

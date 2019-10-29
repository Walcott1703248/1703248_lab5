public class GiftList {
	node head;


	 public void insert(Giftbasket gift) 
	{//insert  at end into link list function //

		node Node=new node();	// create a new node//
		Node.data =gift;//data coming from the user//

		if(head==null)//Checking to see if head is null//
		{
			head = Node;
		}else {
			node n = head;
			while(n.Next!=null)//travel between the different nodes//
			{
				n=n.Next;
			}
			n.Next= Node;
		}
	}


	public void Display()//printing out the values//
	{
	node Node =head;
	while(Node.Next!=null)//searching through the node or traveling through node//
	{
		System.out.println(Node.data);//prints out values//
		Node=Node.Next;//shifts through nodes//
	}
	System.out.println(Node.data);
	}


	}
 


		
	
	
		
	


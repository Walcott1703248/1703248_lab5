
public class node {
	Giftbasket data;
	 node Next;

	public node() {//default constructor//
		data=data;
		this.Next=null;
	}

	public node(Giftbasket data, node next) {//primary constructor//
		this.data=data;
		Next = Next;
	}

	public Giftbasket getData() {
		return data;  
	}

	public void setData(Giftbasket data) {
		this.data = data;
	}

	public node getNext() {
		return Next;
	}

	public void setNext(node next) {
		Next = next;
	}

	}


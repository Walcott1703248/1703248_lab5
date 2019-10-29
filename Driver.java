import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		GiftList list = new GiftList();
		Giftbasket gift;
		
		int id;
		String type;
		float cost;
		
		Scanner scanner=new Scanner(System.in);
		int i = 0;
		while(i<3) {
		System.out.print("Please enter a  BasketID");
		 id = scanner.nextInt();
		
		System.out.print("Enter Basket type");
		type = scanner.next();
		
		System.out.print("Enter Basket cost");
		 cost = scanner.nextInt();
		 gift = new Giftbasket(id, type, cost);
			list.insert(gift);
			i++; 
		
	}
		
		list.Display();
	}
}


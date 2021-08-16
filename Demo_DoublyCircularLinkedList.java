
import Collections.DoublyCircularLinkedList;
import java.util.*;

class Demo_DoublyCircularLinkedList
{
	public static void main(String args[]) throws Exception
	{
		int choice = 1;
		int Data = 0;
		Scanner sobj = new Scanner(System.in);
		int Position = 0;
		int count = 0;

		DoublyCircularLinkedList<Integer> obj = new DoublyCircularLinkedList<Integer>();

		System.out.println("Welcome to Marvellous Collection Framework");

		while(choice != 0)
		{
			System.out.println("__________________________");
			System.out.println("Enter your choice");
			System.out.println("__________________________");
			System.out.println("1 : Insert First");
			System.out.println("2 : Insert Last");
			System.out.println("3 : Insert at position");
			System.out.println("4 : Delete First");
			System.out.println("5 : Delete Last");
			System.out.println("6 : Delete at position");
			System.out.println("7 : Display");
			System.out.println("8 : Count");
			System.out.println("0 : Exit");
			System.out.println("__________________________");
			choice = sobj.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println("Enter the Data");
					Data = sobj.nextInt();
					obj.InsertAtFirst(Data);
					break;
				
				case 2:
					System.out.println("Enter the Data");
					Data = sobj.nextInt();
					obj.InsertAtLast(Data);
					break;
					
				case 3:
					System.out.println("Enter the Data");
					Data = sobj.nextInt();
					System.out.println("Enter the Position");
					Position = sobj.nextInt();

					obj.InsertAtPosition(Position, Data);
					break;
				
				case 4:
					obj.DeleteAtFirst();
					break;
			
				case 5:
					obj.DeleteAtLast();
					break;

				case 6:
					System.out.println("Enter the Position");
					Position = sobj.nextInt();
					obj.DeleteAtPosition(Position);
					break;
	
				case 7:
					obj.Display();
					obj.DisplayReverse();
					break;
	
				case 8:
					count = obj.Count();
					System.out.println("Number Of Elements = " + count);
					break;


				case 0:
					choice = 0;
					break;
				default:
					System.out.println("Invalid Choice");
			}
		}
		sobj.close();
		System.out.println("Thank you for using Marvellous Collenction Framework");
	}
}



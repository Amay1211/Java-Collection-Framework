
import Collections.stack;
import java.lang.*;
import java.util.*;

class Demo_Stack <T>
{
	public static void main(String args[]) throws Exception
	{
		int choice = 1;
		int Data = 0;
		Scanner sobj = new Scanner(System.in);
		
		stack<Integer> obj = new stack<Integer>();

		System.out.println("Welcome to Marvellous Collection Framework");

		while(choice != 0)
		{
			System.out.println("__________________________");
			System.out.println("Enter your choice");
			System.out.println("__________________________");
			System.out.println("1 : Push the Element");
			System.out.println("2 : Pop the elment");
			System.out.println("3 : Peep the elements");
			System.out.println("4 : Display");
			System.out.println("5 : Count");
			System.out.println("0 : Exit");
			System.out.println("__________________________");
			choice = sobj.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println("Enter the Data");
					Data = sobj.nextInt();
					obj.Push(Data);
					break;
				
				case 2:
					obj.Pop();
					break;
					
				case 3:
					obj.Peep();
					break;
				
				case 4:
					obj.Display();
					break;
			
				case 5:
					int ret = obj.Count();
					System.out.println("the number of elements in Statck is :" + ret);

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



package Collections;


class Node <T>
{
	T Data;
	Node<T> next;

	public Node(T Data)
	{
		this.Data = Data;
		this.next = null;
	}
}

public class SingleCircularLinkedList <T>
{
	Node<T> Head;
	Node<T> Tail;

	public SingleCircularLinkedList()
	{
		Head = null;
		Tail = null;
	}
	
	public void InsertAtFirst(T Data)
	{
		Node<T> newn = new Node<T>(Data);

		if((Head == null)&&(Tail == null))
		{
			Head = newn;
			Tail = newn;
			Tail.next = Head;
		}
		else
		{

			newn.next = Head;
			Head = newn;
			Tail.next = Head;
		}
	}

	public void InsertAtLast(T Data)
	{ 
		Node<T> newn = new Node<T>(Data);
		Node<T> temp = Head;

		if((Head == null)&&(Tail == null))
		{
			Head = newn;
			Tail = newn;
			Tail.next = Head;
		}
		else
		{
			Tail.next = newn;
			newn.next = Head;
			Tail = newn;
		}
	}	

	public void InsertAtPosition(int pos,T Data)
	{
		if((pos <= 0) || (pos > (Count()+1)))
		{
			System.out.println("Invalid Position");
		}
		else if(pos == 1)
		{
			InsertAtFirst(Data);
		}
		else if(pos == (Count() + 1))
		{
			InsertAtLast(Data);
		}
		else
		{
			Node<T> newn = new Node<T>(Data);

			Node<T> temp = Head;
			
			for(int i = 1;i < (pos -1);i++)
			{
				temp = temp.next;
			}
			
			newn.next = temp.next;
			temp.next = newn;

		}
	}
	public void Display()
	{
		int result = 0;

		Node<T> temp = Head;

		if((Head == null)&&(Tail == null))
		{
			System.out.println("Empty List");
			return;
		}
		else
		{
			do
			{
				System.out.print("->" + temp.Data);
				temp = temp.next;
			}while(Tail.next != temp);
			
			System.out.println();
		}
	}

	public int Count()
	{
		int result = 0;
		Node<T> temp = Head;
		
		if((Head == null)&&(Tail == null))
		{
			System.out.println("Empty List");
			return 0;
		}
		else
		{
			do
			{
				result++;
				temp = temp.next;
			}while(Tail.next != temp);
		}
		return result;
	}

	public void DeleteAtFirst() 
	{
		if(Count() == 0)
		{
			return;
		}
		else if(Tail == Head)
		{
			Tail = null;
			Head = null;
		}
		else
		{
			Tail.next = Head.next;
			Head = Head.next;

		//Head = Head.next;
		//Tail.next = Head;
		}
	}
	
	public void DeleteAtLast() 
	{
		Node<T> temp = Head;
		
		if(Count() == 0)
		{
			return;
		}
		else if(Tail == Head)
		{
			Tail = null;
			Head = null;
		}
		else
		{
			do
			{
				temp = temp.next;

			}while(temp.next.next != Head);

			temp.next = Head;
			Tail = temp;
		}
	}	

	public void DeleteAtPosition(int pos)
	{
		if((pos <= 0) || (pos > Count()))
		{
			System.out.println("Invalid Position");
		}
		else if(pos == 1)
		{
			DeleteAtFirst();
		}
		else if(pos == Count())
		{
			DeleteAtLast();
		}
		else
		{
			Node<T> temp = Head;

			for (int i = 1;i < (pos - 1);i++)
			{
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}
}


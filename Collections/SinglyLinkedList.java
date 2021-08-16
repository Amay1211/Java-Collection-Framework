package Collections;


class Node <T>
{
	public T Data;
	public Node<T> next;
	
	public Node(T Data)
	{
		this.Data = Data;
		this.next = null;
	}		
}


public class SinglyLinkedList <T>
{
	public Node<T> Head;
	
	public SinglyLinkedList()
	{
		this.Head = null;
	}
	
	public void InsertAtFirst(T Data)
	{

		Node<T> newn = new Node<T>(Data);

		if(Head == null)
		{
			Head = newn;
		}
		else
		{
			newn.next = Head;
			Head = newn;
		}
	}

	public void InsertAtLast(T Data)
	{
		Node<T> newn = new Node<T>(Data);

		if(Head == null)
		{
			Head = newn;
		}
		else
		{
			Node<T> Temp = Head;
			while(Temp.next != null)
			{
				Temp = Temp.next;
			}
			Temp.next = newn;						
		}
	}	
	
	public void InsertAtPosition(int pos,T Data)
	{
		if((pos<=0)||(pos > (Count()+1)))
		{
			System.out.println("Invalid Position");
		}
		else if(pos == 1)
		{
			InsertAtFirst(Data);
		}
		else if(pos == Count()+1)
		{
			InsertAtLast(Data);
		}
		else
		{
			Node<T> newn = new Node<T>(Data);
			Node<T> Temp = Head;

			for (int i = 1;i<(pos-1);i++)
			{
				Temp = Temp.next;
			}
			newn.next = Temp.next;
			Temp.next = newn;

		}
	}
	public void Display()
	{
		Node<T> Temp = Head;
		if(Count() == 0)
		{
			System.out.println("List Is Empty");
		}
		else 
		{
			while(Temp != null)
			{
				System.out.print("->" + Temp.Data);
				Temp = Temp.next;
			}
			System.out.println();
		}
	}

	public int Count()
	{
		Node<T> Temp = Head;
		int result = 0;

		while (Temp != null)
		{
			result++;
			Temp = Temp.next;
		}
		return result;
	}

	public void DeleteAtFirst() 
	{
		if(Head == null)
		{
			System.out.println("List Is empty");
		}
		else	
		{
			Head = Head.next;
		}
	}
	
	public void DeleteAtLast() 
	{
		if(Head == null)
		{
			System.out.println("List Is empty");
		}
		else	
		{
			Node<T> Temp = Head;
			
			if(Temp.next == null)
			{
				Head = null;
			}
			else
			{
				while(Temp.next.next != null)
				{
					Temp = Temp.next;
				}
				Temp.next = null;
			}
		}
	}

	public void DeleteAtPosition(int pos)
	{
		if((pos<=0)||(pos > Count()))
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
			Node<T> Temp = Head;

			for (int i = 1;i<(pos-1);i++)
			{
				Temp = Temp.next;
			}

			Temp.next = Temp.next.next; 
		}
	}
	
}


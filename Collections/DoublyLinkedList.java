package Collections;

class Node <T>
{
	T Data;
	Node<T> next;
	Node<T> prev;

	public Node(T Data)
	{
		this.Data = Data;
		this.next = null;
		this.prev = null;
	}
}

public class DoublyLinkedList <T>
{
	Node<T> Head;
	public DoublyLinkedList()
	{
		Head = null;
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
			Head.prev = newn;
			Head = newn;
		}
	}

	public void InsertAtLast(T Data)
	{ 
		Node<T> newn = new Node<T>(Data);
		Node<T> temp = Head;

		if(temp == null)
		{
			Head = newn;
		}
		else
		{
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newn;
			newn.prev = temp;
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
			
			for(int i = 1;i < pos;i++)
			{
				temp = temp.next;
			}
			newn.next = temp;
			newn.prev = temp.prev;
			temp.prev.next = newn;
			temp.prev = newn; 

		}
	}
	public void Display()
	{
		Node<T> temp = Head;
		while(temp != null)
		{
			System.out.print("->" + temp.Data);
			temp = temp.next;
		}
		System.out.println();
	}

	public int Count()
	{
		int result = 0;
		Node<T> temp = Head;

		while(temp != null)
		{
			result++;
			temp = temp.next;
		}
		return result;
	}

	public void DeleteAtFirst() 
	{
		Head = Head.next;
		Head.prev = null;
	}
	
	public void DeleteAtLast() 
	{
		Node<T> temp = Head;
		while(temp.next.next != null)
		{
			temp = temp.next;
		}
		temp.next = null;
	}

	public void DeleteAtPosition(int pos)
	{
		if((pos <= 0) || (pos >Count()))
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

			for (int i = 1;i < pos;i++)
			{
				temp = temp.next;
			}
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;	
		}
	}
}


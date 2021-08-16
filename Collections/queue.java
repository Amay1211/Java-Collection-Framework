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

public class queue <T>
{
	Node<T> Top;
	T elements;

	public queue()
	{
		this.Top = null;
	}
	
	public void enQueue(T Data)
	{
		Node<T> newn = new Node<T>(Data);

		if(Top == null)
		{
			Top = newn;
		}
		else
		{
			newn.next = Top;
			Top = newn;
		}
	}
	public void deQueue()
	{
		Node<T> temp = Top;

		if(Top == null)
		{
			System.out.println("queue is empty");
			return;
		}
		else if(temp.next == null)
		{
			System.out.println("the Popped Element is " + Top.Data);
			Top = null;
		}
		else
		{
			while(temp.next.next != null)
			{	
				temp = temp.next;
			}
			System.out.println("the Popped Element is " + temp.next.Data);
			temp.next = null;
		}
	}

	public void Peep()
	{
		if(Top == null)
		{
			System.out.println("queue is empty");
		}
		else
		{
			System.out.println("the Peeped Element is " + Top.Data);
		}
	}
	public void Display()
	{
		Node<T> temp = Top;
		if(Top == null)
		{
			System.out.println("queue is empty");
		}
		else
		{
			while(temp!=null)
			{
				System.out.print("->" + temp.Data);
				temp = temp.next;
			}
			System.out.println();
		}
		
	}
	public int Count()
	{
		Node<T> temp = Top;
		int result = 0;

		while(temp!=null)
		{
			result++;
			temp = temp.next;
		}
		return result;
	}
}

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

public class stack <T>
{
	Node<T> Top;
	T elements;

	public stack()
	{
		this.Top = null;
	}
	
	public void Push(T Data)
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
	public void Pop()
	{
		if(Top == null)
		{
			System.out.println("Stack is empty");
			return;
		}
		else
		{
			System.out.println("the Popped Element is " + Top.Data);
			Top = Top.next;
		}
	}

	public void Peep()
	{
		if(Top == null)
		{
			System.out.println("Stack is empty");
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
			System.out.println("Stack is empty");
		}
		else
		{
			while(temp!=null)
			{
				System.out.println("|" + temp.Data + "|");
				temp = temp.next;
			}
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

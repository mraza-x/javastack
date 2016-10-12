// Mohammed Raza
// CSC 236
// Lab 7, #1 (class5)

public class Graph<T> implements GraphADT<T>
{
	private int maxSize;

	private int root;

	private T[] list;

	public Graph()
	{
		maxSize = 100;
		root = 0;
		list = (T[]) new Object[maxSize];
	}

	public Graph(int size)
	{
		if(size <= 0)
		{

			System.err.println("Creating an array of the size 100.");

			maxSize = 100;
		}
		else
			maxSize = size;


		root = 0;

		list = (T[]) new Object[maxSize];
	}

	public void initializeGraph()
	{
		for(int i=0; i<root; i++)
			list[i] = null;

		root = 0;
	}

	public boolean isEmptyGraph()
	{
		return (root == 0);
	}

	public boolean isFullGraph()
	{
		return (root == maxSize);
	}

	public void createGraph(T newItem) throws StackOverflowException
	{
		if(isFullGraph())
			throw new StackOverflowException();

		list[root] = newItem;

		root++;
	}

	public T print() throws StackUnderflowException
	{
		if(isEmptyGraph())
			throw new StackUnderflowException();

		return (T)list[root - 1];
	}

	public void remove() throws StackUnderflowException
	{
		if(isEmptyGraph())
			throw new StackUnderflowException();

		root--;
		list[root] = null;
	}


}
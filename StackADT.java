// Mohammed Raza
// CSC
// Lab 4, #1 (class4)

public interface GraphADT<T>
{
	public void initializeGraph();

	public boolean isEmptyStack();

	public boolean isFullStack();

	public void createGraph(T newItem) throws StackOverflowException;

	public T peek() throws StackUnderflowException;

	public void pop() throws StackUnderflowException;

}
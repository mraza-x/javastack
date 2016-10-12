// Mohammed Raza
// CSC 236
// Lab 7, #1 (class4)

public interface GraphADT<T>
{
	public void initializeGraph();

	public boolean isEmptyGraph();

	public boolean isFullGraph();

	public void createGraph(T newItem) throws StackOverflowException;

	public T print() throws StackUnderflowException;

	public void remove() throws StackUnderflowException;

}
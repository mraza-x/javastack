// Mohammed Raza
// CSC
// Lab 4, #1 (main)

public class StackDemo
{
	public static void main(String[] args)
	{
		Graph<String> graph = new Graph<String>(100);

		try
		{
			graph.createGraph("Hobart");
			graph.createGraph("Melbourne");
			graph.createGraph("Brisbane");
			graph.createGraph("Canberra");
			graph.createGraph("Darwin");
			graph.createGraph("Black Stump");
			graph.createGraph("Perth");
			graph.createGraph("Adelaide");
			graph.createGraph("Sydney");
		}

		catch (StackOverflowException sofe)
		{
			System.out.println(sofe.toString());
			System.exit(0);
		}

		System.out.println("Graph elements: ");

		while(!graph.isEmptyGraph())
		{
			System.out.println(graph.peek() + " ");
			graph.pop();
		}

		System.out.println();
	}
}

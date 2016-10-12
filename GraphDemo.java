// Mohammed Raza
// CSC 236
// Lab 7, #1 (main)

public class GraphDemo
{
	public static void main(String[] args)
	{
		Graph<String> graph = new Graph<String>(100);

			graph.createGraph("Hobart");
			graph.createGraph("Melbourne");
			graph.createGraph("Brisbane");
			graph.createGraph("Canberra");
			graph.createGraph("Darwin");
			graph.createGraph("Black Stump");
			graph.createGraph("Perth");
			graph.createGraph("Adelaide");
			graph.createGraph("Sydney");

		System.out.println("Graph elements (depth first): ");

		while(!graph.isEmptyGraph())
		{
			System.out.println(graph.print() + " ");
			graph.remove();
		}

		System.out.println();


		System.out.println("Graph elements (breadth first): ");

			graph.createGraph("Adelaide");
			graph.createGraph("Perth");
			graph.createGraph("Black Stump");
			graph.createGraph("Darwin");
			graph.createGraph("Brisbane");
			graph.createGraph("Hobart");
			graph.createGraph("Canberra");
			graph.createGraph("Melbourne");
			graph.createGraph("Sydney");

		while(!graph.isEmptyGraph())
		{
			System.out.println(graph.print() + " ");
			graph.remove();
		}

	}
}

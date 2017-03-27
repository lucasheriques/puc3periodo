import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.String;
import java.io.IOException;;

public class main {
	static InputStream is;
	static InputStreamReader isr;
	static BufferedReader in;

	public static void main(String[] args) throws IOException {
		is = System.in;
		isr = new InputStreamReader(is);
		in = new BufferedReader(isr);

		String a = in.readLine();
		String[] arr = a.split("\\t");
		Graph graph = new Graph(Integer.parseInt(arr[0]));

		try {
			while (!a.equals(null)) {
				a = in.readLine();

				arr = a.split("\\t");

				graph.addEdge(Integer.parseInt(arr[0]) - 1, Integer.parseInt(arr[1]) - 1, Integer.parseInt(arr[2]));

			}

		}

		catch (NullPointerException e) {
			graph.print();
			graph.DFS();
			System.err.println("Fim do Arquivo");
		}



	}

}

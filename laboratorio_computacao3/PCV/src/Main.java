import com.sun.xml.internal.fastinfoset.algorithm.IntEncodingAlgorithm;

import java.io.*;
import java.lang.String;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    static InputStream is;
    static InputStreamReader isr;
    static BufferedReader in;

    public static void main(String[] args) throws IOException {
        is = System.in;
        isr = new InputStreamReader(is);
        in = new BufferedReader(new FileReader("/Users/lucashenrique/PUC/3periodo/laboratorio_computacao3/PCV/src/k11.txt"));

        String a = in.readLine();
        int tamanho = Integer.parseInt(a);

        String[] arr = a.split("\\t");
        Graph graph = new Graph(tamanho);

        try {
            while (!a.equals(null)) {
                a = in.readLine();
                arr = a.split("\\t");
                graph.addEdge(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
                graph.addEdge(Integer.parseInt(arr[1]), Integer.parseInt(arr[0]), Integer.parseInt(arr[2]));
            }
        } catch (NullPointerException e) {
            graph.print();

            long tempoInicio;
            long tempoFim;
            long tempoPassado = 0;
            tempoInicio = System.currentTimeMillis();
            graph.circuitoHamilton();
            tempoFim = System.currentTimeMillis();
            tempoPassado += (tempoFim - tempoInicio);

            System.out.println("Tempo de execucao: " + tempoPassado);


            System.err.println("\nFim do Arquivo");
        }
    }

}


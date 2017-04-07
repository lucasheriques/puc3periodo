import com.sun.xml.internal.fastinfoset.algorithm.IntEncodingAlgorithm;

import java.io.*;
import java.lang.String;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    static InputStream is;
    static InputStreamReader isr;
    static BufferedReader in;

    public static int calculaFatorial(int n) {
        int result = 1;

        for (int i = n; i > 1; i--) {
            result *= i;
        }

        return result;
    }

    public static int menorNumero(int[] n) {
        int menor = Integer.MAX_VALUE;

        for (int i : n) {
            if (menor > i)
                menor = i;
        }

        return menor;
    }

    public static void PCV(Graph graph, int initialCity) {
        // todas as cidades, com exceção da inicial, precisam ser percorridas
        ArrayList<Integer> cidadesParaPercorrer = new ArrayList<>();

        for (int i = 0; i < graph.num_vertices; i++) {
            if (i != initialCity)
                cidadesParaPercorrer.add(i);
        }

        ArrayList<ArrayList<Integer>> rotas = new ArrayList<>();

        calculaDistancias(rotas, 0, cidadesParaPercorrer);

        System.out.println(rotas.toString());

        int[] distancias = new int[calculaFatorial(graph.num_vertices - 1)];
        String menorRota = "";

        System.out.println("\nDistâncias: ");
        for (int i = 0; i < distancias.length; i++) {
            distancias[i] = graph.vertexDistance(initialCity, rotas.get(i).get(0));
            for (int j = 0; j < rotas.get(0).size(); j++) {
                if (j < rotas.get(0).size() - 1)
                    distancias[i] += graph.vertexDistance(rotas.get(i).get(j), rotas.get(i).get(j + 1));
                else
                    distancias[i] += graph.vertexDistance(rotas.get(i).get(j), initialCity);
            }
            System.out.print(distancias[i] + " ");
        }

        System.out.println("\nMenor distância: " + menorNumero(distancias));
    }

    public static void calculaDistancias(ArrayList<ArrayList<Integer>> rotas, int start, ArrayList<Integer> cidades) {
        ArrayList<Integer> item = new ArrayList<>(cidades);

        if (start >= cidades.size()) {
            rotas.add(item);
        }

        for (int j = start; j <= cidades.size() - 1; j++) {
            swap(cidades, start, j);
            calculaDistancias(rotas, start + 1, cidades);
            swap(cidades, start, j);
        }

    }

    public static void swap(ArrayList<Integer> cidades, int i, int j) {
        int temp = cidades.get(i);
        cidades.set(i, cidades.get(j));
        cidades.set(j, temp);
    }

    public static void main(String[] args) throws IOException {
        is = System.in;
        isr = new InputStreamReader(is);
        in = new BufferedReader(new FileReader("/Users/lucashenrique/PUC/3periodo/laboratorio_computacao3/PCV/src/k4.txt"));

        String a = in.readLine();

        String[] arr = a.split("\\t");
        Graph graph = new Graph(Integer.parseInt(arr[0]));

        try {
            while (!a.equals(null)) {
                a = in.readLine();
                arr = a.split("\\t");
                graph.addEdge(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
                graph.addEdge(Integer.parseInt(arr[1]), Integer.parseInt(arr[0]), Integer.parseInt(arr[2]));
            }
        } catch (NullPointerException e) {
            graph.print();
            PCV(graph, 0);
            graph.circuitoHamilton();
            System.err.println("\nFim do Arquivo");
        }
    }

}


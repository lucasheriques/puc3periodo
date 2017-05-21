/**
 * Created by lucashenrique on 06/05/17
 * Autor: Lucas Henrique de Faria Silva
 * Matricula: 556597
 * Curso: Engenharia de Software
 * Disciplina: Laboratório de Computação 3
 * Professor: Felipe Cunha
 *
 * Instruções: para executar o algoritmo do Saco do Papai Noel, comente a linha 181 e descomente a linha 182
 * Caso queira executar o algoritmo das Estátuas de Gelo, descomente a 181 e comente a linha 182
 */

import java.io.*;
import java.util.Arrays;

public class Main {

    // int comp - comprimento necessario
    // int[] comprimentos - comprimentos disponíveis
    public static int numeroBlocos(int comp, int[] comprimentos) {
        int numeroBlocos = 0;
        Arrays.sort(comprimentos);
        int i = comprimentos.length - 1;
        while (comp > 0 && i >= 0) {
            if (comprimentos[i] <= comp) {
                comp -= comprimentos[i];
                numeroBlocos++;
            } else
                i--;
        }
        return numeroBlocos;
    }

    /*
     * peso - vetor de pesos
	 * nPresentes - vetor de numero de presentes
	 * pesoMax - peso disponivel (max: 50)
	*/
    public static void problemaNatal(int[] pesos, int[] nPresentes, int pesoMax) {
        int[][] tabela = new int[nPresentes.length + 1][pesoMax + 2];

        // preenche colunas
        for (int i = 1; i <= nPresentes.length; i++) {
            tabela[i][0] = pesos[i - 1];
            tabela[i][1] = 0;
        }

        // preenche colunas com as capacidades de 0 até 50
        tabela[0][0] = 0;
        for (int i = 1; i < 52; i++) {
            tabela[0][i] = i - 1;
        }

        // preenche primeira linha com o valor do 1 item
        for (int j = 1; j < 52; j++) {
            if (tabela[1][0] < j - 1)
                tabela[1][j] = nPresentes[0];
            else
                tabela[1][j] = 0;
        }

        int pacotes = 0;

        // coluna = j
        // linha = i
        for (int i = 2; i <= nPresentes.length; i++) {
            for (int j = 2; j < 52; j++) {
                int pesoItem = tabela[i][0];
                int valorItem = nPresentes[i - 1];
                int capacidadeAtual = tabela[0][j];

                // comparar o peso com a capacidade atual
                if (capacidadeAtual >= pesoItem) {
                    int valorTotal = valorItem + tabela[i - 1][j - pesoItem];
                    tabela[i][j] = Math.max(valorTotal, tabela[i - 1][j]);
                } else {
                    tabela[i][j] = tabela[i - 1][j];
                }
            }
        }

        int nPacotes = 0;
        int l = nPresentes.length;
        int brinquedosTotal = tabela[nPresentes.length][pesoMax + 1];
        int pesoTotal = 0;
        boolean achou = false;
        int aux = brinquedosTotal;

        // conta o numero de pacotes e recupera o peso total dos presentes
        for (int c = pesoMax + 1; c > 0; c--) {
            int valorAtual = tabela[l][c];
            int valorAnterior = tabela[l][c - 1];


            if (brinquedosTotal != valorAnterior && !achou) {
                pesoTotal = tabela[0][c];
                achou = true;
            }

            if (valorAnterior != valorAtual && achou) {
                int temp = c;

                while (aux - nPresentes[l-1] != tabela[l-1][c]) {
                    c--;
                    if (c < 0) {
                        l--;
                        c = temp;
                    }
                }

                nPacotes++;
                aux -= nPresentes[l-1];
                l--;
            }

            if (aux == 0)
                break;

        }

        System.out.println(brinquedosTotal + " brinquedos.");
        System.out.println("Peso: " + pesoTotal + " kg.");
        System.out.println("Sobra(m) " + (nPresentes.length - nPacotes) + " pacote(s)");
    }

    public void readNatal() throws IOException {
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        String ler = null;
        ler = d.readLine();

        int contInstancias = 1;

        int repeticoes = Integer.parseInt(ler);

        while (repeticoes > 0) {
            ler = d.readLine();
            int nPacotes = Integer.parseInt(ler);
            //int tempoDisponivel = Integer.parseInt(ler.split(" ")[1]);


            int[] nPresentes = new int[Integer.parseInt(ler)];
            int[] pesos = new int[Integer.parseInt(ler)];

            for (int i = 0; i < nPacotes; i++) {
                ler = d.readLine();

                nPresentes[i] = Integer.parseInt(ler.split(" ")[0]);
                pesos[i] = Integer.parseInt(ler.split(" ")[1]);
            }

            problemaNatal(pesos, nPresentes, 50);

            repeticoes--;
        }
        d.close();
    }

    public void readBlocos() throws IOException {
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        String ler = null;
        ler = d.readLine();
        int casos = Integer.parseInt(ler);
        while (casos > 0) {
            ler = d.readLine();
            int nBlocos = Integer.parseInt(ler.split(" ")[0]);
            int comp = Integer.parseInt(ler.split(" ")[1]);
            int[] blocos = new int[nBlocos];
            ler = d.readLine();
            for (int i = 0; i < ler.split(" ").length; i++) {
                blocos[i] = Integer.parseInt(ler.split(" ")[i]);
            }
            casos--;
            System.out.println("Número de blocos necessários: " + numeroBlocos(comp, blocos));
        }
        d.close();
    }

    public static void main(String[] args) throws IOException {
        Main ex = new Main();

        //ex.readBlocos(); // Festival de Estátuas de Gelo
        ex.readNatal(); // Saco do Papai Noel
    }
}

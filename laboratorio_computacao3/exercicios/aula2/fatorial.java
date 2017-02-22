import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.lang.String;
import java.io.IOException;
import java.math.BigInteger;

public class fatorial {

	static InputStream is;
	static InputStreamReader isr;
	static BufferedReader in;

  public static BigInteger fatorialRecursivo (BigInteger i) {
    if (i.equals(BigInteger.ONE))
      return BigInteger.ONE;

    else
      return i.multiply(fatorialRecursivo(i.subtract(BigInteger.ONE)));
  }

  public static BigInteger fatorialIterativo (BigInteger i) {
    BigInteger fat = new BigInteger("1");

    while (!i.equals(BigInteger.ONE)) {
      fat = fat.multiply(i);
      i = i.subtract(BigInteger.ONE);
    }

    return fat;
  }

	public static void main(String[] args) throws IOException {
    is = System.in;
    isr = new InputStreamReader(is);
    in = new BufferedReader(isr);

		String a = in.readLine();

    while (!a.equals("FIM")) {

      long tempoInicio;
      long tempoFim;
      long tempoPassado = 0;

      BigInteger n = new BigInteger(a);

      for (int i = 0; i < 30; i++) {
        tempoInicio = System.currentTimeMillis();
        fatorialIterativo(n);
        tempoFim = System.currentTimeMillis();
        tempoPassado += (tempoFim - tempoInicio);
      }

      System.out.println(""+fatorialIterativo(n));
      System.out.println("Tempo de execucao (iterativo): " + (tempoPassado / 30));

      for (int i = 0; i < 30; i++) {
        tempoInicio = System.currentTimeMillis();
        fatorialRecursivo(n);
        tempoFim = System.currentTimeMillis();
        tempoPassado += (tempoFim - tempoInicio);
      }

      System.out.println("Tempo de execucao (recursivo): " + (tempoPassado / 30));

      a = in.readLine();
    }
	}
}

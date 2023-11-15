package codigos;

import java.util.Arrays;

public class arrays2 {
  public static void main(String[] args) {
    /*
     * outro modo de declarar um array, de maneira mais simples e sem colocar um
     * limite de itens no arrays
     */
    String[] letras = { "A", "B", "C", "J", "X" };

    /*
     * for (int i = 0; i < letras.length; i++) {
     * System.out.println(letras[i]);
     * }
     */

    // Outro modo de imprimir um array
    System.out.println(Arrays.toString(letras));
  }
}

package codigos;

public class arraysOuVetores {
  public static void main(String[] args) {
    /*
     * int numero1 = 1;
     * int numero2 = 2;
     * int numero3 = 3;
     * int numero4 = 4;
     * int numero5 = 5;
     */

    /*
     * array fechado, aonde não consigo colocar mais de 5 itens, mas posso usar
     * menos que 5.
     * Esse array só serve para números.
     */
    int[] numeros = new int[5];
    // preenchendo o array
    numeros[0] = 1;
    numeros[1] = 2;
    numeros[2] = 3;
    numeros[3] = 4;
    numeros[4] = 5;
    // modo errado de mostrar um array
    // nesse modo, mostra em cache aonde está guardado.
    System.out.println(numeros);
    // modo de laços para mostrar o array
    for (int i = 0; i < numeros.length; i++) {
      System.out.println(numeros[i]);
    }
  }
}

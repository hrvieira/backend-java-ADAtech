package codigos;

public class arrays4 {
  public static void main(String[] args) {
    int[] numeros = { 9, 10, 12, 25, 2 };

    int maior = numeros[0];
    int menor = numeros[0];
    int media = 0;

    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] > maior) {
        maior = numeros[i];
      }

      if (numeros[i] < menor) {
        menor = numeros[i];
      }

      media += numeros[i];
    }

    System.out.println("Maior: " + maior);
    System.out.println("Menor: " + menor);
    // esse (float faz com que o número tenha decimais)
    System.out.println("Média: " + media / (float) numeros.length);

  }
}

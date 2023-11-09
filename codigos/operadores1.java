package codigos;

public class operadores1 {
  public static void main(String[] args) {
    int a;
    int b = 2;
    a = 3;

    int soma = a + b;
    int subtracao = a - b;
    int multipicacao = a * b;
    /*
     * para que o float funcione normalmente, deve adicionar (float) dentro da
     * variável
     */
    float divisao = (float) a / b;

    System.out.println(soma);
    System.out.println(subtracao);
    System.out.println(multipicacao);
    System.out.println(divisao);
  }
}

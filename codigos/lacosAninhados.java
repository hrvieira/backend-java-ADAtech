package codigos;

public class lacosAninhados {
  public static void main(String[] args) {
    // usando laços aninhados para montar uma tabela
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.println(j + " x " + i + " = " + j * i);
      }
    }
  }
}

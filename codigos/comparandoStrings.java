package codigos;

public class comparandoStrings {
  public static void main(String[] args) {

    String nome = "Luiz";

    System.out.println(nome.toLowerCase());
    System.out.println(nome.toUpperCase());
    System.out.println(nome.length());

    // comparando strings

    String outroNome = "luiz";
    System.out.println(nome.equals(outroNome));
    System.out.println(nome.equalsIgnoreCase(outroNome));

  }
}

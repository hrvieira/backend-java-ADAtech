package codigos;

public class arrays {
  public static void main(String[] args) {
    // array de string
    String[] letras = new String[5];
    letras[0] = "A";
    letras[1] = "B";
    letras[2] = "C";
    letras[3] = "J";
    letras[4] = "X";

    for (int i = 0; i < letras.length; i++) {
      System.out.println(letras[i]);
    }
  }
}

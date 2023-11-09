package codigos;

public class condicionais3 {
  public static void main(String[] args) {
    // trabalhando em cima das condionais2, usando switch
    int nota = -1;
    String graducacao;

    // a 80 b 70 c 60 d 0
    if (nota >= 80) {
      graducacao = "A";
    } else if (nota < 80 && nota >= 70) {
      graducacao = "B";
    } else if (nota < 70 && nota >= 60) {
      graducacao = "C";
    } else if (nota < 60 && nota >= 0) {
      graducacao = "D";
    } else {
      graducacao = "";
    }

    switch (graducacao) {
      case "A":
      case "B":
        System.out.println("Aluno aprovado!");
        break;
      case "C":
      case "D":
        System.out.println("Não aprovado!");
        break;
      default:
        System.out.println("Graduação inválida!");
    }
  }
}

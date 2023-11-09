package codigos;

public class boleano {
  public static void main(String[] args) {
    boolean fimDeSemana = true;
    boolean fazendoSol = true;

    boolean vamosAPraia = fimDeSemana && fazendoSol;

    System.out.println("Vamos a praia nesse fim de semana? " + vamosAPraia);

    // depois da aula de condicionais
    // usando sintaxe do operador ternário (condicao ? valor_se_verdadeiro :
    // valor_se_falso;)

    String talvez = (fimDeSemana && fazendoSol) ? "Com certeza!" : "Nesse fim de semana não vai dar.";

    System.out.println("Vamos a praia nesse fim de semana? " + talvez);
  }
}

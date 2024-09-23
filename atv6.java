import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
     Double numeroA;
     Double numeroB;
    
    System.out.println("Digite o valor de A:");
     numeroA = entrada.nextDouble();
    System.out.println("Digite o valor de B:");
     numeroB = entrada.nextDouble();
    System.out.println("A tem o valor de:" + numeroA + "\nB tem o valor de:" + numeroB);
    
    // Troca de valores //
     Double troc = numeroA;
     numeroA = numeroB;
     numeroB = troc;
    
    System.out.printf("\nAgora, após a troca." + "\nA tem o valor de:" + numeroA + "\nB tem o valor de:" + numeroB);
    
  }
}
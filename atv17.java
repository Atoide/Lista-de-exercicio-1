import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in); 
    Integer votosN;
    Integer votosB;
    Integer votosV;
   
   System.out.println("Digite o número de votos núlos:");
     votosN = entrada.nextInt();
   System.out.println("Digite o número de votos brancos:");
     votosB = entrada.nextInt();
   System.out.println("Digite o número de votos válidos:");
     votosV = entrada.nextInt();
   
    // Soma total dos eleitores //
    Integer total = votosN + votosB + votosV;
    
    // Cálculo percentual //
    Double pctN = (double) votosN / total * 100;
    Double pctB = (double) votosB / total * 100;
    Double pctV = (double) votosV / total * 100;
    
    
    System.out.printf("Percentual de votos núlos: %.2f%%\n", pctN);
    System.out.printf("Percentual de votos brancos: %.2f%%\n", pctB);
    System.out.printf("Percentual de votos válidos: %.2f%%\n", pctV);
    
  }
}

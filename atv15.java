import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Double x1p1;
    Double y1p1;
    Double x2p2;
    Double y2p2;
     
    System.out.println("Defina o valor de X linha de P1:");
     x1p1 = entrada.nextDouble();
    System.out.println("Defina o valor de Y linha de P1:");
     y1p1 = entrada.nextDouble();
    System.out.println("Defina o valor de X linha de P2:");
     x2p2 = entrada.nextDouble();
    System.out.println("Defina o valor de Y linha de P2:");
     y2p2 = entrada.nextDouble();
    
    // Fórmula distância //
    Double sub1 = x2p2 - x1p1;
    Double sub2 = y2p2 - y1p1;
    Double som1 = (sub1 * sub1) + (sub2 * sub2);
    Double raiz = Math.sqrt(som1);
    
    System.out.println("A distância entre os pontos é:" + raiz);

  }
}

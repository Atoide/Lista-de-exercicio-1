import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    Double pi = Math.PI; 
    Double raio; 
     System.out.println("De um valor para o raio:");
     raio = entrada.nextDouble();
    
    Double area = pi * (raio * raio); // Fórmula da área do circulo //
     
    System.out.println("A área será:" + area);
 
  }
}
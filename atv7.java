import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in); 
   Double numero;
    
  System.out.println("Digite um número de 0 a 10:");
   numero = entrada.nextDouble();
  System.out.println("O valor quadrado será:" + (numero * numero) + "\nO valor cubico será:" + (numero * numero * numero));
      
  }
}

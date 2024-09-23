import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    Double dividendo;
   	Double divisor;
    Double resto;
    
   System.out.println("Digite o valor do dividendo:");
    dividendo = entrada.nextDouble();
   System.out.println("Digite o valor do divisor:");
    divisor = entrada.nextDouble();
  
    resto = (dividendo % divisor); // Divisao e Resto //
   System.out.println("O resto será:" + resto);
    
  }
}

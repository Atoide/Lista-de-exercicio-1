import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    Double Dolar;
    Double valorDolar = 4.95;
    
   System.out.println("Didite o valor em dólar:");
    Dolar = entrada.nextDouble();
    
    Double valorReal = Dolar * valorDolar; // Conversao //

   System.out.println("O valor em reais será:" + valorReal);

  }
}

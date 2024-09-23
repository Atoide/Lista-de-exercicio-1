import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Double peso;
    Double ml = 35.0;
    
   System.out.println("Quanto você pesa?");
    peso = entrada.nextDouble();
    
    Double litro = ((ml * peso) / 1000); //conersao de ML para L//
    
   System.out.println("É recomendado que vocé beba " + litro + "L de água.");

  }
}
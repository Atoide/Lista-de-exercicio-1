import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   Scanner entrada = new Scanner (System.in);
    Double tmpF;
    
    System.out.println("Temperatura em Fahrenheit:"); 
     tmpF = entrada.nextDouble(); 
     
    Double tmC = (((tmpF - 32) / 9) * 5); // Fórmula F para C //
    
    System.out.println("Temperatura em Celsius será:" + tmC);

  }
}
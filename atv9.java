import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);
   Double quantidade;
   Double nota;
   Double vlrCaneta = 3.50;
    
   System.out.println("Quantas canetas você quer comprar?");
    quantidade = entrada.nextDouble();
   System.out.println("Qual o valor da sua nota?");
    nota = entrada.nextDouble();
   
   Double troco = (nota - (quantidade * vlrCaneta));
     
   System.out.println("Seu troco será de:" + troco);
   
  }
}
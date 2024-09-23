import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
      Double gasolina;
      Double etanol;
    
    System.out.println("Qual o valor da Gasolina?");
     gasolina = entrada.nextDouble();
    System.out.println("Qual o valor do Etanol?");
     etanol = entrada.nextDouble();
    System.out.println("O da Gasolina é:" + gasolina + "\nO valor do etanol é:" + etanol);
      
    Double vlrGas = ((gasolina /100) * 70);
      etanol = etanol;
   
    if(etanol < vlrGas){
     System.out.println("Portanto a melhor escolha será o Etanol");}
 
    else{System.out.println("Portanto a melhor escolha será a Gasolina");}
 
  }
}
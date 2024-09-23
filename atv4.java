import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   Scanner entrda = new  Scanner(System.in);
    Double nota1;
    Double nota2;
    Double nota3;
    
   System.out.println("insera a primeira nota:");
    nota1 = entrda.nextDouble();
   System.out.println("insera a segunda nota:");
    nota2 = entrda.nextDouble();
   System.out.println("insera a terceira nota:");
    nota3 = entrda.nextDouble();
   
    Double soma = nota1 + nota2 + nota3;
    Double media =  soma / 3;
    
   System.out.println("A media será:" + media); 
    

  }
}
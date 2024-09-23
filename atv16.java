import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
     Double nota1;
     Double nota2;
     Double nota3;
    
     System.out.println("Qual a nota da primeira avaliação do aluno?");
      nota1 = entrada.nextDouble();
     System.out.println("Qual a nota da segunda avaliação do aluno?");
      nota2 = entrada.nextDouble();
     System.out.println("Qual a nota da terceira avaliação do aluno?");
      nota3 = entrada.nextDouble();  

    // Media //
     Double soma = (nota1 + nota2 + nota3);  
     Double media = soma / 3;
    
    System.out.println("A média desse aluno é:" + media);
   
    if( media >= 7){System.out.println("O aluno esta aprovado!");
    }
     else{System.out.println("O aluno não está aprovado!");}
    
  }
}
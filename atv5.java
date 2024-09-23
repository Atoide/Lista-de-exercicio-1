import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
    Double inss;
    Double horaTM;
    Double valorHr;
      
   System.out.println("Valor da hora de trbalho:");
    valorHr = entrada.nextDouble();
   System.out.println("Horas trabalhadas no mês:");
    horaTM = entrada.nextDouble();
   System.out.println("Percentual de desconto do INSS:");
    inss = entrada.nextDouble();
    
    // Valor total/bruto //
    Double bruto = valorHr * horaTM;
    // Desconco INSS //
    Double desconto = (bruto * (inss / 100));
    // Salário líquido //
    Double liquido = bruto - desconto; 
   
   System.out.printf("Salário Bruto: R$%.2f%n", bruto);
   System.out.printf("Desconto INSS: R$%.2f%n", desconto);
   System.out.printf("Salário Líquido: R$%.2f%n", liquido);
    
  }
}
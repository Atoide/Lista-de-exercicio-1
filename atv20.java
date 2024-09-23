import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);
    String nome;
    Integer quant;
    Double precoUni;
      
   System.out.println("Nome do produto:");
    nome = entrada.next();
   System.out.println("Quantidade adiquirida:");
    quant = entrada.nextInt();
   System.out.println("Preço unitário:");
    precoUni = entrada.nextDouble();
    
    Double total = quant * precoUni;
     
    // Descontos //
    Double desconto;
    if(quant <= 5){desconto = total * 0.02;}
    else if(quant <= 10){desconto = total * 0.03;}
    else if(quant < 30){desconto = total * 0.05;}             
    else{desconto = total * 0.10;}  
    
    // Pagamento Final//
    Double Pfinal = total - desconto;
    
   System.out.println("Total: R$" + total);
   System.out.println("Desconto: R$" + desconto);
   System.out.println("Valor Final: R$" + Pfinal);
    
  }
}
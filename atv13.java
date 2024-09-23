import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Double larguraA;
    Double comprimentoA;
    Double larguraC;
    Double comprimentoC;
    Double valorMetroQuadrado;
    
   System.out.println("Informe a largura da área em metros: ");
    larguraA = entrada.nextDouble();
   System.out.println("Informe o comprimento da área em metros: ");
    comprimentoA = entrada.nextDouble();
   System.out.println("Informe a largura da cerâmica em metros: ");
    larguraC = entrada.nextDouble();
   System.out.println("Informe o comprimento da cermâmica em metros: ");
    comprimentoC = entrada.nextDouble();
   System.out.println("Informe o valor do metro quadrado da cerâmica em reais: ");
    valorMetroQuadrado = entrada.nextDouble();
    
    
   // Calcular a Área total //
    Double areaTotal = larguraA * comprimentoA;
   // Calcular a Área ceramica //
    Double areaCeramica = larguraC * comprimentoC ;
   // quantidade, arredondando para cima //
    Integer quantidadeC = (int) Math.ceil(areaTotal / areaCeramica);
   // 10% acabamento //
    Integer quantidadeComAcabamento = (int) Math.ceil(quantidadeC * 1.10);
    
   System.out.println("Quantidade de cerâmicas necessárias com 10% de acabamento: " + quantidadeComAcabamento);
    
   // Valor total a ser pago //
    Double valorTotal = quantidadeComAcabamento * areaCeramica * valorMetroQuadrado;     
    
   System.out.println("Valor total a ser pago: R$ " + valorTotal); 
 
  }
}

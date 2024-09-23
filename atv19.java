import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int opcao;
 double saldo = 1000.00; // Saldo inicial
 String extrato = "";

 do{ System.out.println("Menu do Caixa Eletrônico:");
      System.out.println("1. Exibir saldo");
      System.out.println("2. Exibir extrato");
      System.out.println("3. Realizar depósito");
      System.out.println("4. Realizar saque");
      System.out.println("5. Sair");
     System.out.print("Escolha uma opção: ");
      opcao = scanner.nextInt();
 
    switch (opcao) {
        case 1:
         System.out.println("Seu saldo é: R$ " + saldo);
         break;

        case 2:
         System.out.println("Extrato: " + extrato);
         break;

        case 3:
        
         System.out.print("Digite o valor do depósito: R$ ");
         double deposito = scanner.nextDouble();
         saldo += deposito;
         extrato += "Depósito: R$ " + deposito + "\n";
         System.out.println("Depósito realizado com sucesso!");
         break;

        case 4:
         System.out.print("Digite o valor do saque: R$ ");
         double saque = scanner.nextDouble();
         if (saque <= saldo) {
         saldo -= saque;
         extrato += "Saque: R$ " + saque + "\n";
         System.out.println("Saque realizado com sucesso!");}
         else {System.out.println("Saldo insuficiente para realizar o saque.");}
         break;

        case 5:
         System.out.println("Saindo...");
         break;

        default:
         System.out.println("Opção inválida! Saindo do programa.");
         opcao = 5; // Força a saída do loop
         break;
         
         }
         System.out.println();
    }while (opcao != 5);
     scanner.close();
  }
}
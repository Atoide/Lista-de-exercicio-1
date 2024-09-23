import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a idade da pessoa //
        System.out.print("QUAL A IDADE DA PESSOA?: ");
        int idade = scanner.nextInt();

        // Determina a classificação eleitoral com base na idade //
        String classificacao;
        if (idade < 16) {
            classificacao = "NÃO É ELEITOR";}
         else if (idade >= 16 && idade <= 17 || idade > 65) {
            classificacao = "ELEITOR FACULTATIVO";}
         else {
            classificacao = "ELEITOR OBRIGATÓRIO";}
 
        System.out.println(classificacao);
    }
}
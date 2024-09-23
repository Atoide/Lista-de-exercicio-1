import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);
    String hora;
   System.out.print("Digite a hora no formato HH:MM: ");
     hora = entrada.next();

    // Divide a string em horas e minutos //
    String[] partes = hora.split(":");
    Integer horas = Integer.parseInt(partes[0]);
    Integer minutos = Integer.parseInt(partes[1]);
    
    // Hora para min//
    Integer totalMinutos = horas * 60 + minutos;

   System.out.println("Se passaram " + totalMinutos + " minutos desde o início do dia. ");

    }
}
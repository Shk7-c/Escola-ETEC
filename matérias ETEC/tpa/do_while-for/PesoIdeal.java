package exercicios;
import java.util.Scanner;
 
public class PesoIdeal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char sexo;
        double altura, pesoIdeal;
        int continuar;
 
        do {
            System.out.print("Digite o sexo do usu�rio (f para feminino, m para masculino): ");
            sexo = scanner.next().toLowerCase().charAt(0);
 
            System.out.print("Digite a altura do usu�rio em cent�metros: ");
            altura = scanner.nextDouble();
 
            if (sexo == 'm') {
                pesoIdeal = 52 + (0.75 * (altura - 152.4));
                System.out.println("Peso ideal masculino: " + pesoIdeal + " kg");
            } else if (sexo == 'f') {
                pesoIdeal = 52 + (0.67 * (altura - 152.4));
                System.out.println("Peso ideal feminino: " + pesoIdeal + " kg");
            } else {
                System.out.println("Sexo inv�lido. Por favor, digite 'm' para masculino ou 'f' para feminino.");
            }
 
            System.out.print("Deseja continuar a execu��o? (1-para SIM ou 2-para N�O): ");
            continuar = scanner.nextInt();
 
        } while (continuar == 1);
 
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}

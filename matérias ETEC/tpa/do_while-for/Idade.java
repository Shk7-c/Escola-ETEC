package exercicios;

import java.util.Scanner;

public class Idade{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int anoAtual, anoNascimento, idade;
        int idadeMaisVelho = Integer.MIN_VALUE;
        int idadeMaisNovo = Integer.MAX_VALUE;
        
        int[] idades = new int[10];
 
        System.out.print("Digite o ano atual: ");
        anoAtual = scanner.nextInt();
 
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o ano de nascimento do usu�rio " + (i + 1) + ": ");
            anoNascimento = scanner.nextInt();
            idade = anoAtual - anoNascimento;
 
            idades[i] = idade;
 
            if (idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
            }
 
            if (idade < idadeMaisNovo) {
                idadeMaisNovo = idade;
            }
        }
 
        System.out.println("\nIdades dos usu�rios:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Usu�rio " + (i + 1) + ": " + idades[i] + " anos");
        }
 
        System.out.println("\nIdade do usu�rio mais velho: " + idadeMaisVelho + " anos");
        System.out.println("Idade do usu�rio mais novo: " + idadeMaisNovo + " anos");
 
        scanner.close();
    }
}

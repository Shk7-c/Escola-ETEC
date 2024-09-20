package exerc�cios;
import java.util.Scanner;
public class Media {

	public class MediaAritmetica {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o n�mero inicial do intervalo: ");
	        int inicio = scanner.nextInt();
	        
	        System.out.print("Digite o n�mero final do intervalo: ");
	        int fim = scanner.nextInt();
	        
	        int soma = 0;
	        int contador = 0;
	        int atual = inicio;
	        
	        if (inicio > fim) {
	            System.out.println("O intervalo inicial deve ser menor ou igual ao intervalo final.");
	        } else {
	            while (atual <= fim) {
	                soma += atual;
	                contador++;
	                atual++;
	            }
	            double media = (double) soma / contador;
	            System.out.println("A m�dia aritm�tica dos n�meros entre " + inicio + " e " + fim + " �: " + media);
	        }
	    }
	}
}

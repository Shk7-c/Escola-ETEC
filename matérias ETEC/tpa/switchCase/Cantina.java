package exercicios;
import java.util.Scanner;
public class Cantina {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int cq, cb, pc, mq, xs, code;
	System.out.println("Ebreak;screva o codigo do pedido");
	code = in.nextInt();
	switch(code) {
	case 1:
		System.out.println("nome: Cachorro Quente, pre�o: R$8,00");
		break;
	case 2:
		System.out.println("nome: Cheeseburguer, pre�o: R$12,00");
		break;
	case 3:
		System.out.println("nome: X-salada, pre�o: R$15,00");
		break;
    case 4:
	    System.out.println("nome: Misto Quente, pre�o: R$11,00");
	    break;
    case 5:
	    System.out.println("nome: P�o na Chapa, pre�o: R$6,00");
	default:
	    System.out.println("codigo inexistente");
}
	}
	
	
}


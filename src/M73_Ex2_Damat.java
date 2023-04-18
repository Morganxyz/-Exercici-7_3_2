import java.util.ArrayList;
import java.util.Scanner;

public class M73_Ex2_Damat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "";
		char posicio = ' ';
		int llarFrase = 0;
		String inverse =  "";
		int contador;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdueix una breu frase: ");
		frase = entrada.nextLine();
		
		System.out.println("La frase té " + frase.length() + " lletres, comptant els espais en blanc");
		
		llarFrase = frase.length();
		contador = llarFrase;
		
		for(int i = 0; i <llarFrase; i++) {
			posicio = frase.charAt(contador - 1);
			inverse += posicio;
			contador--;
		}
		
		System.out.println("La frase a la inversa quedaria :" + inverse);
	}

}

package numeroInformado;

import java.util.Scanner;

public class NumeroInformado {

	public static void main(String[] args) {
		
		System.out.println("Digite um número");
		
		Scanner input = new Scanner(System.in);
		
		int numero = input.nextInt();
		
		System.out.println("O numero informado foi: " + numero);
		
		
		input.close();

	}

}

package JuegosMatematicos;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MayorYMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random Aleatorio = new Random();
		Scanner entrada = new Scanner(System.in);
		int numero = Aleatorio.nextInt(50);
		int Respuesta = 0;
		while(Respuesta != numero) {
		System.out.println("Ingresa un n�mero");
		Respuesta = entrada.nextInt();
		if(Respuesta > numero) {
		System.out.println("Tu n�mero es muy alto");
		}else if (Respuesta < numero){
		System.out.println("Tu numero es muy bajo");
		}
		}
		System.out.println("Felicidades haz encontrado el n�mero");
		System.exit(0);
	}

}

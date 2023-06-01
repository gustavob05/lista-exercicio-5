package ExercicioNove;

import java.util.Scanner;
public class Programa{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	Inverter inverter = new Inverter();
	System.out.println("Por favor, informe um número entre 0 e 999999: ");
	Double numero = scanner.nextDouble();
    inverter.setNumero(numero);
	inverter.inversorDeNumeros(numero);
	scanner.close();
	}
}
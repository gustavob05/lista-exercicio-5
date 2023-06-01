import java.util.Scanner;
public class Programa{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Soma soma = new Soma();

    System.out.println("SOMA");

    System.out.println("Digite o primeiro numero:");
    soma.setNumeroUM(scanner.nextInt());
    
    System.out.println("Digite o segundo numero:");
    soma.setNumeroDois(scanner.nextInt());
    
    System.out.println("Digite o terceiro numero:");
    soma.setNumeroTres(scanner.nextInt());

    int resultado = soma.resultado();

    System.out.println("Resultado é: \n" + resultado);

    scanner.close();

    
}
}
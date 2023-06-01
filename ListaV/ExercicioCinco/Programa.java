import java.util.Scanner;
public class Programa{
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        Repetiçao repetiçao = new Repetiçao();

        System.out.println("REPETIÇÃO");

        System.out.println("Informe um numero:");
        int numero = scanner.nextInt();
        repetiçao.setnumero(numero);

        System.out.println("Seguencia em linha:");
         
        repetiçao.repetiçao(numero);

        scanner.close();
    }
}
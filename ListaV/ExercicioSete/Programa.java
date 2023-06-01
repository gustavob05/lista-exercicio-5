import java.util.Scanner;

class Programa{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PositivoNegativo positivoNegativo = new PositivoNegativo();

        System.out.println("Positivo e Negativo");

        System.out.println("Informe o numero:");
        positivoNegativo.setnumero(scanner.nextDouble());

        scanner.close();
    }
}
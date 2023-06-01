import java.util.Scanner;

class Programa{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MediaAritmetica mediaAritmetica = new MediaAritmetica();

        System.out.println("Media Aritmetica");

        System.out.println("Digite o primerio numero:");
        mediaAritmetica.setnumeroUm(scanner.nextDouble());

        System.out.println("Digite o segundo numero:");
        mediaAritmetica.setnumeroDois(scanner.nextDouble());

        double resultado = mediaAritmetica.media();
        System.out.println("A media aritmetica è: \n" + resultado);

        scanner.close();
    }
}
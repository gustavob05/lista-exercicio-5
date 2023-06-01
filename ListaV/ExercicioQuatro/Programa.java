import java.util.Scanner;

class Programa{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MediaAritmetica mediaAritmetica = new MediaAritmetica();
        MediaHarmonica mediaHarmonica = new MediaHarmonica();
        MediaGeometrica mediaGeometrica = new MediaGeometrica();

        System.out.println("CALCULO DE MEDIAS");

        System.out.println("Digite o primeiro numero:");
        double numeroUm = scanner.nextDouble();
        mediaAritmetica.setnumeroUm(numeroUm);
        mediaHarmonica.setnumeroUm(numeroUm);
        mediaGeometrica.setnumeroUm(numeroUm);

        System.out.println("Digite o segundo numero:");
        double numeroDois = scanner.nextDouble();
        mediaAritmetica.setnumeroDois(numeroDois);
        mediaHarmonica.setnumeroDois(numeroDois);
        mediaGeometrica.setnumeroDois(numeroDois);

        System.out.println("Digite o terceiro numero:");
        double numeroTres = scanner.nextDouble();
        mediaAritmetica.setnumeroTres(numeroTres);
        mediaHarmonica.setnumeroTres(numeroTres);
        mediaGeometrica.setnumeroTres(numeroTres);

        double resultadoAritmetica = mediaAritmetica.aritmetica();
        double resultadoHarmonica = mediaHarmonica.harmonica();
        double resultadoGeometrica = mediaGeometrica.geometrica();

        System.out.println("A media aritmetica é: \n" + resultadoAritmetica + "\nA media harmonica è: \n" + resultadoHarmonica + "\nA media geometrica é: \n" + resultadoGeometrica );

        scanner.close();

    }
}
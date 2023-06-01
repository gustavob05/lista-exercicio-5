import java.util.Scanner;
  class Programa{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Temperatura temperatura = new Temperatura();

        System.out.println("Conversão de temperatura");
        
        System.out.println("Informe a temperatura em Fahrenheit:");
        temperatura.settemperaturaFahrenhei(scanner.nextInt());

        double temperaturaCelsius = temperatura.calcularTemperaturaCelsius();
        System.out.println("Temperatura convertida para Celsius:\n" + temperaturaCelsius );

        scanner.close();

    }
  }
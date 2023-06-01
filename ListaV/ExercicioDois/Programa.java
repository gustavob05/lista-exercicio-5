import java.util.Scanner;
 
class Programa{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Porcentagem porcentagem = new Porcentagem();

        System.out.println("Porcentagem do produto");

        System.out.println("Digite o valor do produto:");
        porcentagem.setproduto(scanner.nextInt());

        int resultado = porcentagem.porcentagem();
        
        System.out.println("Valor do produto mais porcentagem:" + resultado );

        scanner.close();
    }
}
import java.util.Scanner;
public class ExercicioOito{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	ExOitoMetodos Imposto = new ExOitoMetodos();
	System.out.println("Por favor, informe o custo do item: ");
	Double custo = scanner.nextDouble();
	Imposto.setCusto(custo);
	System.out.println("Agora, informe a taxa de juros em '%': ");
	Double taxaImposto = scanner.nextDouble();
	Imposto.setTaxaImposto(taxaImposto);
	Imposto.calculoImposto(custo, taxaImposto);
	scanner.close();
	}
}
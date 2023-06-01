public class PositivoNegativo {
    private double numero;

    public void setnumero(double novoNumero){
        numero = novoNumero;
    }
    public double positivoNegativo(double numero){
        this.numero = numero;
        if (numero > 0){
        System.out.println("P");
        } else if (numero <= 0){
        System.out.println("N");
        } else {
        System.out.println("Número inválido!");
        }
        return numero;

    }
}

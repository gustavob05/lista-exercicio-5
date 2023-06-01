public class MediaGeometrica {
    private double numeroUm;
    private double numeroDois;
    private double numeroTres;

    public void setnumeroUm(Double novoValorNumeroUm){
        numeroUm = novoValorNumeroUm;
    }
    public void setnumeroDois(Double novoValorNumeroDois){
        numeroDois = novoValorNumeroDois;
    }
    public void setnumeroTres(Double novoValorNumeroTres){
        numeroTres = novoValorNumeroTres;
    }
    public double geometrica(){
        return Math.cbrt(numeroUm * numeroDois * numeroTres);
    }
    
}

public class MediaHarmonica {
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
    public double harmonica(){
        return 3/((1/numeroUm) + (1/numeroDois) + (1/numeroTres));
    }
    
}

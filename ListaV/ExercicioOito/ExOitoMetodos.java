public class ExOitoMetodos {
    private Double taxaImposto;
    private Double custo;
    private Double novoValor;
    
    public Double getTaxaImposto() {
        return taxaImposto;
    }
    public void setTaxaImposto(Double taxaImposto) {
        this.taxaImposto = taxaImposto;
    }
    public Double getCusto() {
        return custo;
    }
    public void setCusto(Double custo) {
        this.custo = custo;
    }
    public Double getNovoValor() {
        return novoValor;
    }
    public void setNovoValor(Double novoValor) {
        this.novoValor = novoValor;
    }
    public Double calculoImposto(Double custo, Double taxaImposto){
        this.taxaImposto = taxaImposto;
        this.custo = custo;
        novoValor = ((taxaImposto/100)*custo) + custo;
        System.out.printf("O valor do produto, acrescido de impostos, é: %.2f Reais", (novoValor));
        return null;
    }
         

}


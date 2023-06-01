package ExercicioNove;

public class Inverter {
    private Double numero;
    private Double centenas;
    private Double dezenas;
    private Double unidades;
    
    public Double getNumero() {
        return numero;
    }
    public void setNumero(Double numero) {
        this.numero = numero;
    }
    public Double inversorDeNumeros(Double numero){
        this.numero = numero;
        
        if ((numero >= 0) && (numero < 100)){ 
        dezenas = Math.floor(numero/10);
        unidades = Math.floor(numero - (dezenas * 10)/1);
        System.out.printf("Número invertido: %.0f%.0f", (unidades), (dezenas));
        
        } else if ((numero >= 100) && (numero < 1000)){ 
        centenas = Math.floor(numero/100);
        dezenas = Math.floor((numero - (100*centenas))/10);
        unidades = Math.floor(numero -((100*centenas)+ 10*dezenas)/1);
        System.out.printf("Número invertido: %.0f%.0f%.0f", (unidades),(dezenas),(centenas));
        } else{
        System.out.println("O número informado é inválido!!");
        }
        return null;
    }
    }
    

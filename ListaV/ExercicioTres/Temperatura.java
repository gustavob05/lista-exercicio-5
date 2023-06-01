public class Temperatura {
    private int temperaturaFahrenheit;
    private double temperaturaCelsius;

    public void settemperaturaFahrenhei(int novaTemperatura){
        temperaturaFahrenheit  = novaTemperatura;
    }
    
    public double calcularTemperaturaCelsius(){
        return (temperaturaCelsius = (temperaturaFahrenheit - 32) / 1.8);
    }
    



    
}

public class Repetiçao {
    private int numero;
    private int contador = 0;
      
    public int setnumero (int novoValorNumero){
        numero = novoValorNumero;
        return numero; 
      }

      public int repetiçao (int numero){
        
        while (true){
          System.out.print("  " + numero  );
          contador++;
          if (contador > numero)
          break;
      }
      return numero;
       
      }


}

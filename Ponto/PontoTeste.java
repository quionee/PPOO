package pontoteste;

public class PontoTeste {

    public static void main(String[] args) {
        
        Ponto ponto = new Ponto(1.5f, 2.5f);
      
        System.out.println(ponto.getPonto());
        
        System.out.printf("A distancia entre os pontos e: %.2f%n", ponto.calcularDistancia(3.5f, 5.5f));
    }
   
}

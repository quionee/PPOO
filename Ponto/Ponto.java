package pontoteste;

public class Ponto {
    private float x;
    private float y;
    
    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public String getPonto() {
        return "As coordenadas (x, y) do ponto sao: (" + x + "; " + y + ")";
    }
    
    public double calcularDistancia(float x2, float y2) {
        return Math.sqrt((Math.pow((x2 - x), 2)) + (Math.pow((y2 - y), 2)));
    }

}

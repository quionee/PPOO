package horarioteste;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public void exibir() {
        System.out.printf("%02dh:%02dm:%02ds%n", hora, minuto, segundo);
    }
    
    public void formatarTempo(int segundos) {
        int hora = segundos / 3600;
        segundos %= 3600;
        int minuto = segundos / 60;
        segundos %= 60;
        int segundo = segundos;
        
        Horario tempo = new Horario(hora, minuto, segundo);
        tempo.exibir();
    }
    
}

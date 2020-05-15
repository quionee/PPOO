import java.io.*;

public class ManipuladorArquivoBinario {
    
    public static void gravaArquivoBinario(DiarioDeClasse diario, String nomeArquivo) {
        
        try {
            ObjectOutputStream arquivo = new ObjectOutputStream(new FileOutputStream(nomeArquivo));
            arquivo.writeObject(diario);
            arquivo.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public static DiarioDeClasse leArquivoBinario(String nomeArquivo) {
        
        DiarioDeClasse diario = null;
        try {
            ObjectInputStream arquivo = new ObjectInputStream(new FileInputStream(nomeArquivo));
            diario = (DiarioDeClasse)arquivo.readObject();
            System.out.println("ERROO");
            arquivo.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return diario;
        
    }
    
}

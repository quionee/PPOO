package carrinhoteste;

public class Carrinho {
    private String cliente;
    private String[] carrinho;
    private int dia;
    private int mes;
    private int ano;
    private int contadorItens;
    
    public Carrinho(String cliente, int dia, int mes, int ano) {
        this.cliente = cliente;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        carrinho = new String[5];
        contadorItens = 0;
    }
    
    public Carrinho(String cliente, int dia, int mes, int ano, int qtdProdutos) {
        this.cliente = cliente;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        carrinho = new String[qtdProdutos];
        contadorItens = 0;
    }
    
    public String getCliente() {
        return cliente;
    }
    
    public void inserirItem(String produto) {
        carrinho[contadorItens] = produto;
        ++contadorItens;
    }
    
    public void exibir() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Data da compra: " + dia + "/" + mes + "/" + ano);
        System.out.print("Itens do carrinho: ");
        for (int i = 0; i < contadorItens; ++i) {
            System.out.print(carrinho[i] + " ");
        }
        System.out.println();
    }
    
}

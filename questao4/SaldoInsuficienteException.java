public class SaldoInsuficienteException extends Exception {
    
    private int numeroConta;
    
    public SaldoInsuficienteException(int numeroConta) {
        super("Saldo insuficiente na conta: " + numeroConta);
        this.numeroConta = numeroConta;
    }
    
}

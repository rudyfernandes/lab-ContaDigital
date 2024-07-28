public class ContaPoupanca extends Conta{
    @java.lang.Override
    public void imprimirExtrato() {
        System.out.println("Extrato da conta poupança");
        super.imprimirInfosComuns();

    }
}

public class ContaCorrente extends Conta{

    @java.lang.Override
    public void imprimirExtrato() {
        System.out.println("Extrato da conta corrente");
        super.imprimirInfosComuns();

    }


}

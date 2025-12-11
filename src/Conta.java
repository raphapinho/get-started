import java.io.PrintStream;

public class Conta {
    private static int id;
    private static double saldo;
    private static double chequeEspecial;

    public Conta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
        if (saldo <= 500) {
            this.chequeEspecial = 50.00;
        } else {
            this.chequeEspecial = saldo / 2;
        }
    }

    // Consultar saldo
    public static PrintStream getSaldo() {
        return System.out.printf("seu saldo é de R$ %s\n",Conta.saldo);
    }

    // consultar cheque especial
    public static PrintStream getChequeEspecial() {
        return System.out.printf("seu cheque especial é de R$ %s\n",Conta.chequeEspecial);
    }

    // Depositar dinheiro;
    public static void depositarDinheiro(double deposito) {
        Conta.saldo += deposito;
    }

    // Sacar dinheiro;
    public static void sacarDinheiro(double dinheiroSacado) {
        if (dinheiroSacado > Conta.saldo) {
            System.out.println("Saldo insulficiente");

        } else {
            System.out.printf("Você sacou R$ %s\n", dinheiroSacado);
            Conta.saldo -= dinheiroSacado;
        }
    }
    // Pagar um boleto.

    // Verificar se a conta está usando cheque especial.

}

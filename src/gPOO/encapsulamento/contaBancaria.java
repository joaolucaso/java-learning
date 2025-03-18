package gPOO.encapsulamento;

public class contaBancaria {
    private String titular;
    private double saldo;

    public contaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;

    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void mostarSaldo() {
        System.out.println("Saldo de " + titular + "R$: " + saldo);


    }
}

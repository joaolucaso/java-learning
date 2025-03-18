package gPOO.encapsulamento;

public class main {
    public static void main(String[] args) {

        contaBancaria conta = new contaBancaria("igão do flow", 1000);
        contaBancaria conta2 = new contaBancaria("igão do Podpah",500);

        conta.depositar(1000);
        conta.sacar(200);
        conta.mostarSaldo();

        conta2.depositar(1.50);
        conta2.sacar(500);
conta2.mostarSaldo();
    }
}

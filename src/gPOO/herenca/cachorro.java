package gPOO.herenca;

public class cachorro  extends animal{

    public cachorro(String nome) {
        super(nome);
    }

    @Override
    void emitirSom() {
        System.out.println(nome+ " Está latindo!");
    }
}

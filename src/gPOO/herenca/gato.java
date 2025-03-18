package gPOO.herenca;

public class gato extends animal {


    public gato(String nome) {
        super(nome);
    }

    @Override
    void emitirSom() {
        System.out.println(nome + " Está miando!");
    }
}

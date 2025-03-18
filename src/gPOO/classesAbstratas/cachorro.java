package gPOO.classesAbstratas;

public class cachorro extends animal {
    public cachorro(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome + " Está latindo au au!");
    }

}

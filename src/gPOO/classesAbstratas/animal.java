package gPOO.classesAbstratas;


abstract class animal {
    String nome;

    public animal(String nome) {
        this.nome = nome;
    }

    public void dormir() {
        System.out.println(nome + " Está Dormindo...");

    }

    abstract void fazerSom();
}

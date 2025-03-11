package gPOO;



public class POO {

    public static void main(String[] args) {
        pessoas pessoa1 = new pessoas("Eduardo Bolsonaro", 28, "branco");


    }
}

class pessoas {
    String nome;
    int idade;
    String raca;

    public pessoas(String nome, int idade, String raca) {
        System.out.println("pessoa criada :" + nome + "," + idade + "," + raca);
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;

    }
}


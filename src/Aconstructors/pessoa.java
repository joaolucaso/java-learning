package Aconstructors;

public class pessoa {
    private String nome;
    private int idade;

    public pessoa() {
    }

    public pessoa(int idade, String nome){
this.idade =idade;
this.nome =nome;
    }

    public pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

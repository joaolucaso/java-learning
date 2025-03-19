package hEnum;

enum Diadasemana {

    SEGUNDA("Segunda-feira"),
    TERCA("Terça-feira"),
    QUARTA("Quarta-feira"),
    QUINTA("Quinta-feira"),
    SEXTA("Sexta-feira"),
    SABADO("Sábado"),
    DOMINGO("Domingo");


    private String nomeCompleto;

    Diadasemana(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }


    public String getNomeCompleto() {
        return nomeCompleto;


    }
}


public class enum2 {
    public static void main(String[] args) {
        DiaDasemana dia = DiaDasemana.SEXTA;
        System.out.println("HOJE È: "+ dia);


    }
}

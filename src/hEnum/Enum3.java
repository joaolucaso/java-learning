package hEnum;

public class Enum3 {


    public static void main(String[] args) {

        for (DiaDasemana dia : DiaDasemana.values()) {
            System.out.println(dia + " - posição " + dia.ordinal());

        }
DiaDasemana DiaEscohido = DiaDasemana.valueOf("QUARTA");
        System.out.println("Escolhido: "+ DiaEscohido);

    }
}


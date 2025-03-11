package fCasting;

public class casting {
    public static void main(String[] args) {

        int i = 10;
        double euSouUmDoubleAgora = (int) i;

        double like = 0.0;
        int agoraEuSouUmInt = (int) like;

        String castingDiferente = "90";
        System.out.println(castingDiferente + "eu sou uma String");

        int int2 = Integer.parseInt(castingDiferente);

        System.out.println(int2 + "eu sou um inteiro");
    }
}

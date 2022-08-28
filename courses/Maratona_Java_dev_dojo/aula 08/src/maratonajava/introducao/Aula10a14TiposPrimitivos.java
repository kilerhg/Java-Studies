package maratonajava.introducao;

public class Aula10a14TiposPrimitivos {

    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean

        int age = 10;
        int idade = (int) 10000000000l;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'o';
        String nome = "lucas";

        System.out.println("O seu nome é: " + nome);
        System.out.println("A idade é " + age + " anos");
        System.out.println("Salario: " + salarioFloat);
        System.out.println("A idade é " + idadeShort);
    }

}

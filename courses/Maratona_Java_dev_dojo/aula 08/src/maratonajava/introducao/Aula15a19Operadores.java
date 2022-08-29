package maratonajava.introducao;

public class Aula15a19Operadores {

    public static void main(String[] args) {

        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println("resultado: " + resultado);

        int resto = 2 % 2;

        boolean isRestoPar = resto == 0;

        System.out.println("Resto é par: " + isRestoPar);

        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQue30 = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQue30: " + isDentroDaLeiMaiorQue30);
        System.out.println("isDentroDaLeiMenorQue30: " + isDentroDaLeiMenorQue30);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;
        boolean isPlaystationCincoCompravel = valorTotalContaPoupanca >= valorPlaystation || valorTotalContaCorrente >= valorPlaystation;

        System.out.println("Playstation 5 compravel: " + isPlaystationCincoCompravel);

        double bonus = 1800;
        // bonus = bonus + 1000;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        System.out.println("bonus " + bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador; // teste
        --contador;
        System.out.println(contador);

    }

}

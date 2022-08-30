package maratonajava.exercicios.introducao;

public class Aula27a31EstruturasDeRepeticaoExercicios {

    public static void main(String[] args) {

        // while, do while, for

        int max_number = 1000000;

        for (int i = 0; i < max_number; i++) {
            if (i % 2 == 0) {
                System.out.println("Numero : " + i + " é um numero Par");
            }
        }
    }
}

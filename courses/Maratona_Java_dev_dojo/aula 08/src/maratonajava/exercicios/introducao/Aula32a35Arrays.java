package maratonajava.exercicios.introducao;

public class Aula32a35Arrays {

    public static void main(String[] args) {

        int[] age = new int[3];

        age[0] = 21;
        age[1] = 15;
        age[2] = 11;

        String[] name = new String[3];

        name[0] = "Lucas";
        name[1] = "Nunes";
        name[2] = "Assis";

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }


    }
}

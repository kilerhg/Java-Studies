package maratonajava.exercicios.introducao;

public class Aula36a38ArraysMultidimensionais {

    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("===");

        for(int[] arrStart:dias){
            for(int arr:arrStart){
                System.out.println(arr);
            }
        }

        System.out.println("=====");

        int[][] var = new int[3][];
        int[][] var2 = {{1, 0}, {0,0,0}, {1,2,3,4}};

        var[0] = new int[2];
        var[1] = new int[3];
        var[2] = new int[]{1,2,3,4};

        var[0][0] = 1;

        for(int[] i:var){
            for(int j:i){
                System.out.println(j);
            }
        }
    }
}

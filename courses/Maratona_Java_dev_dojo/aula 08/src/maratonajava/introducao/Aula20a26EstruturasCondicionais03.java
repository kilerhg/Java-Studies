package maratonajava.introducao;

public class Aula20a26EstruturasCondicionais03 {

    public static void main(String[] args) {

        byte dia = 8;

        // char, int, byte, short, enum, String
        switch (dia){
            case 1: {
                System.out.println("Domingo");
                break;
            }
            case 2: {
                System.out.println("Segunda");
                break;
            }
            case 3: {
                System.out.println("Terça");
                break;
            }
            case 4: {
                System.out.println("Quarta");
                break;
            }
            case 5: {
                System.out.println("Quinta");
                break;
            }
            case 6: {
                System.out.println("Sexta");
                break;
            }
            case 7: {
                System.out.println("Sabado");
                break;
            }
            default: {
                System.out.println("Opção invalida");
                break;
            }
        }

        char sexo = 'F';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':{
                System.out.println("Mulher");
                break;
            }
            default: {
                System.out.println("Opção invalida");
                break;
            }
        }

    }

}

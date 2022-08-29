package maratonajava.exercicios.introducao;

public class Aula20a26EstruturasCondicionais03Exercicios {

    public static void main(String[] args) {
        // dados de 1 a 7, imprima se é dia util ou fim de semana
        // 1 - domingo

        int dia = 8;
        String tipoDia;

        switch (dia){
            case 1:
                tipoDia = "Fim De Semana";
                break;
            case 2:
                tipoDia = "Dia Útil";
                break;
            case 3:
                tipoDia = "Dia Útil";
                break;
            case 4:
                tipoDia = "Dia Útil";
                break;
            case 5:
                tipoDia = "Dia Útil";
                break;
            case 6:
                tipoDia = "Dia Útil";
                break;
            case 7:
                tipoDia = "Fim De Semana";
                break;
            default:
                System.out.println("Opção invalida");
                tipoDia = "Invalido";
                break;
        }

        System.out.println("Dia " + dia + " É um " + tipoDia);

    }

}

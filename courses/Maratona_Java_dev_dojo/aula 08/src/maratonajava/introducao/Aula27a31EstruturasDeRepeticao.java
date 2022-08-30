package maratonajava.introducao;

public class Aula27a31EstruturasDeRepeticao {

    public static void main(String[] args) {

        // while, do while, for

        int cont = 0;

        while (cont < 10){
            System.out.println(cont);
            cont++;
        }

        cont = 0;
        do {
            System.out.println("do " + cont);
            cont++;
        }while (cont < 10);

        for (int i=0; i<10; i++){
            System.out.println("for " + i);
        }

        int valorMax = 50;

        for (int i = 0; i < valorMax; i++) {
            if (i <= 25) {
                System.out.println(i);
            }else{
                break;
            }
        }

        double valorCarroFor = 50000;
        float valorParcelaFor = 1000;
        int qtdParcelasFor = 0;

        for (int i = 0; i < valorCarroFor ; i += valorParcelaFor) {
            qtdParcelasFor++;
        }

        System.out.println("Quantidade de parcelas necessarias: " + qtdParcelasFor);


        double valorCarro = 50000;
        double valorParcelado = 0;
        float valorParcela = 1000;
        int qtdParcelas = 0;

        while(true){
            if (valorParcelado<valorCarro){
                qtdParcelas++;
                valorParcelado += valorParcela;
            }else{
                break;
            }
        }

        System.out.println("Quantidade de parcelas necessarias: " + qtdParcelas);

        // break
        double valorCarroAula = 50000;
        for (int parcela = 1; parcela < valorCarroAula ; parcela++) {
            double valorParcelaAula = valorCarroAula / parcela;
            if (valorParcelaAula < 1000){
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcelaAula);
        }

        // continue
        double valorCarroAula2 = 50000;
        for (int parcela = (int) valorCarroAula2; parcela >= 1 ; parcela--) {
            double valorParcelaAula2 = valorCarroAula2 / parcela;
            if (valorParcelaAula2 < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcelaAula2);

        }
    }

}

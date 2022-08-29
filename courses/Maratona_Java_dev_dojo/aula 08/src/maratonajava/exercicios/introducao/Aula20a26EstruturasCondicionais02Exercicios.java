package maratonajava.exercicios.introducao;

public class Aula20a26EstruturasCondicionais02Exercicios {

    public static void main(String[] args) {

        double salario = 70000;

        double faixa;


        if(salario <= 34712){
            faixa = 9.7;
        }else if(salario > 34712 && salario <= 68507){
            faixa = 37.35;
        }else{
            faixa = 49.5;
        }

        double valor_imposto = salario * (faixa/100);
        double salario_liquido = salario * (1-(faixa/100));

        System.out.println("seu salario bruto de: " + salario + " na faixa de " + faixa + " com valor do imposto de " + valor_imposto + ", o liquido resultado é: " + salario_liquido);
    }

}

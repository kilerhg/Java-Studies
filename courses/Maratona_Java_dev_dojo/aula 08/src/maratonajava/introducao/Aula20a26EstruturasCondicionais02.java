package maratonajava.introducao;

public class Aula20a26EstruturasCondicionais02 {

    public static void main(String[] args) {

        double salario = 6000;
        String mensagemDoar = "Eu vou doar";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        // (condicao) ? verdadeiro : falso
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }

}

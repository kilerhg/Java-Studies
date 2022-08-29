package maratonajava.introducao;

public class Aula20a26EstruturasCondicionais01 {

    public static void main(String[] args) {

        int idade = 65;
        boolean isAdulto = idade >= 18;
         if(isAdulto){
             System.out.println("Authorizado");
         }else if(idade >= 60) {
             System.out.println("Terceira idade");
         }else {
             System.out.println("Não Authorizado");
         }
    }

}

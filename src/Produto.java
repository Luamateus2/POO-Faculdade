import java.util.ArrayList;
public class Produto

{    private String[]listaNomes= {"Arroz","Feijão","Macarrão"};
    public void exibirProdutos() {
        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }

}

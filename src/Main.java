import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Questão 1
        ListaNomes listaNomesObj = new ListaNomes();
        String[] listaNomes = listaNomesObj.getListaNomes();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a posição que deseja acessar do Array: ");
        int posicao = teclado.nextInt();
        try{
            String nome = listaNomes[posicao];
            System.out.println("O nome na posição " + posicao + " é: " + nome);

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Essa posição não existe");
        }
        //Questão 3
        Produto produto = new Produto();
        produto.exibirProdutos();

        //Questão6e7
        Carrinho carrinho = new Carrinho();

        ProdutoPerecivel produto1 = new ProdutoPerecivel("Arroz", "Grãos de arroz", 1.0, 5.0, "01/01/2025");
        ProdutoNaoPerecivel produto2 = new ProdutoNaoPerecivel("Sabão", "Componentes de limpeza", 0.5, 2.5, "Sabão em barra");

        carrinho.inserirItem(produto1);
        carrinho.inserirItem(produto2);

        double total = carrinho.totalCarrinho();

        System.out.println("Total do carrinho: R$" + total);

    }

}
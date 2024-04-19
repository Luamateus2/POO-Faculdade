import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produtos> itens;


    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void inserirItem(Produtos produtos) {
        itens.add(produtos);
    }

    public double totalCarrinho() {
        double total = 0.0;
        for (Produtos produtos : itens) {
            total += produtos.getPreco();
        }
        return total;
    }
}



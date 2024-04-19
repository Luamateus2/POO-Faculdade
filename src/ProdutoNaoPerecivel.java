public class ProdutoNaoPerecivel extends Produtos {
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;
    public ProdutoNaoPerecivel(String nome, String composicao, Double peso, Double preco, String descricao) {
        super(nome, composicao, peso, preco);
        this.descricao = descricao;
    }
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Descrição: " + descricao);
    }
}

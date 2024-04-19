public class ProdutoPerecivel extends Produtos {
    private String dataValidade;

    public ProdutoPerecivel(String nome, String composicao, Double peso, Double preco,String dataValidade) {
        super(nome, composicao, peso, preco);
        this.dataValidade = dataValidade;
    }


    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Data de validade: " + dataValidade);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}

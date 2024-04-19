public abstract class Produtos {
    private String nome;
    private String composicao;
    private Double peso;
    private Double preco;

    public Produtos(String nome, String composicao, Double peso, Double preco) {
        this.nome = nome;
        this.composicao = composicao;
        this.peso = peso;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Composição: " + getComposicao());
        System.out.println("Peso: " +getPeso());
        System.out.println("Preço: " + getPreco());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

package model;

public class LivroDigital extends Livro {

    private String plataforma;

    public LivroDigital(String titulo, String autor, Double preco, String plataforma) {
        super(titulo, autor);
        this.plataforma = plataforma;
        this.definirPreco(preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("===== DETALHES DO LIVRO DIGITAL =====");
        System.out.println("ISBN: " + super.getIsbn());
        System.out.println("TÍTULO: " + super.getTitulo());
        System.out.println("AUTOR: " + super.getAutor());
        System.out.println("PLATAFORMA DE VENDAS: " + this.getPlataforma());
        System.out.println("PREÇO: R$" + this.getPreco());
        System.out.println("=====================================");
    }

    @Override
    public void definirPreco(Double preco) {
        this.setPreco(preco);
    }

    public String getPlataforma() {
        return plataforma;
    }
}

package model;

public class LivroFisico extends Livro {

    private boolean capaDura;
    private boolean temRasuras;

    public LivroFisico(String titulo, String autor, Double preco, boolean capaDura, boolean temRasuras) {
        super(titulo, autor);
        this.capaDura = capaDura;
        this.definirPreco(preco);
        this.temRasuras = temRasuras;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("======== DETALHES DO LIVRO FÍSICO ========");
        System.out.println("ISBN: " + this.getIsbn());
        System.out.println("TÍTULO: " + this.getTitulo());
        System.out.println("AUTOR: " + this.getAutor());
        String ehCapaDura = this.isCapaDura() ? "Sim" : "Não";
        System.out.println("CAPA DURA? " + ehCapaDura);
        System.out.println("PREÇO: R$" + this.getPreco());
        System.out.println("==========================================");
    }

    @Override
    public void definirPreco(Double preco) {
        this.setPreco(preco + 5.00);
    }

    @Override
    public void temRasuras() {
        System.out.println(this.temRasuras ? "Sim" : "Não");
    }

    public boolean isCapaDura() {
        return capaDura;
    }
}

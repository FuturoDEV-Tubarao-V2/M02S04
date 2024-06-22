package model;

import java.util.UUID;

public abstract class Livro {

    private String titulo;
    private final String isbn;
    private String autor;
    private Double preco;

    protected Livro() {
        this.isbn = this.gerarISBN();
    }

    protected Livro(String titulo) {
        this();
        this.titulo = titulo;
    }

    protected Livro(String titulo, String autor) {
        this(titulo);
        this.autor = autor;
    }

    public abstract void exibirDetalhes();

    public abstract void definirPreco(Double preco);

    public void temRasuras() {
        System.out.println("Não possui rasuras, ou não se aplica");
    }

    private String gerarISBN() {
        return UUID.randomUUID().toString();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

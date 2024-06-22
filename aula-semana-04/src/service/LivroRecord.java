package service;

public record LivroRecord(String titulo, String autor, Integer anoPublicacao) {

    public LivroRecord(String titulo) {
        this(titulo, null, null);
    }
}

package exceptions;

public class NullPointerExceptionExample {
    public static void main(String[] args) throws AnimalNaoEncontradoException {
        String exemplo = null;
        System.out.println(exemplo.length());
        System.out.println("Alguma coisa");
        throw new AnimalNaoEncontradoException("");
    }
}

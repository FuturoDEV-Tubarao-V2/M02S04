package interfaces;

public interface Animal {

    void detalharRotinaAlimentar();

    default void voar() {
        System.out.println("Esta classe não oferece suporte a essa operação.");
    }

    default void dormir() {
        System.out.println("ZzzZzzZzZZZ");
    }
}

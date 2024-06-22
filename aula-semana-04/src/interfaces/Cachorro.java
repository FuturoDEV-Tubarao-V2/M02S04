package interfaces;

public class Cachorro implements Animal {

    @Override
    public void detalharRotinaAlimentar() {
        System.out.println("300g de ração 3 vezes ao dia, a depender do porte");
    }
}

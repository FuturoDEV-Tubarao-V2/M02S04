package interfaces;

import java.util.List;

public class RotinaAnimalService {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Crocodilo crocodilo = new Crocodilo();
        Gato gato = new Gato();
        Leao leao = new Leao();
        Tigre tigre = new Tigre();

        List<Animal> animais = List.of(cachorro, crocodilo, gato, leao, tigre);

        for (Animal animal : animais) {
            animal.detalharRotinaAlimentar();
            animal.dormir();
            animal.voar();
        }
    }
}

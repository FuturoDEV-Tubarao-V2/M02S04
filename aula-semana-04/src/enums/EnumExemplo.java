package enums;

import java.util.Scanner;

public class EnumExemplo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 à 7: ");
        int valor = scanner.nextInt();

        switch (valor) {
            case 1 -> DiasDaSemanaEnum.DOMINGO.detalhaDiaDaSemana();
            case 2 -> DiasDaSemanaEnum.SEGUNDA_FEIRA.detalhaDiaDaSemana();
            case 3 -> DiasDaSemanaEnum.TERCA_FEIRA.detalhaDiaDaSemana();
            case 4 -> DiasDaSemanaEnum.QUARTA_FEIRA.detalhaDiaDaSemana();
            case 5 -> DiasDaSemanaEnum.QUINTA_FEIRA.detalhaDiaDaSemana();
            case 6 -> DiasDaSemanaEnum.SEXTA_FEIRA.detalhaDiaDaSemana();
            case 7 -> DiasDaSemanaEnum.SABADO.detalhaDiaDaSemana();
            default -> throw new IllegalArgumentException("Não existe um dia da semana com este número");
        }

        scanner.close();
    }
}

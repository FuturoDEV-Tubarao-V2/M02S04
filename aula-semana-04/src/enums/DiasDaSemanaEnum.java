package enums;

public enum DiasDaSemanaEnum {
    DOMINGO {
        @Override
        void detalhaDiaDaSemana() {
            System.out.println("Domingo");
        }
    },
    SEGUNDA_FEIRA {
        @Override
        void detalhaDiaDaSemana() {
            System.out.println("Segunda-Feira");
        }
    },
    TERCA_FEIRA {
        @Override
        void detalhaDiaDaSemana() {
            System.out.println("Terça-Feira");
        }
    },
    QUARTA_FEIRA {
        @Override
        void detalhaDiaDaSemana() {
            System.out.println("Quarta-Feira");
        }
    },
    QUINTA_FEIRA {
        @Override
        void detalhaDiaDaSemana() {
            System.out.println("Quinta-Feira");
        }
    },
    SEXTA_FEIRA {
        @Override
        void detalhaDiaDaSemana() {
            System.out.println("Sexta-Feira");
        }
    },
    SABADO {
        @Override
        void detalhaDiaDaSemana() {
            System.out.println("Sábado");
        }
    };

    abstract void detalhaDiaDaSemana();
}

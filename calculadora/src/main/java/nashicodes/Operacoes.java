package nashicodes;

public class Operacoes {
    public static double soma(double p1, double p2) {
        return p1 + p2;
    }

    public static double subtracao(double p1, double p2) {
        return p1 - p2;
    }

    public static double multiplicacao(double p1, double p2) {
        return p1 * p2;
    }

    public static double divisao(double p1, double p2) throws DivisaoZero {

        if (p2 == 0) {
            throw new DivisaoZero();
        }

        return p1 / p2;
    }
}

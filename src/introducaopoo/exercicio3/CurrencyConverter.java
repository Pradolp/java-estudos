package introducaopoo.exercicio3;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double amoutToPay(double dolar, double reais){
        double total = dolar * reais;
        return total + (total * IOF);
    }
}

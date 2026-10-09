package introducaopoo.exercicio3;

public class Main {
    public static void main(String[] args) {
        double dolar, reais;
        dolar = 3.10;
        reais = 200.00;
        System.out.println("What is the dollar price? " + dolar);
        System.out.println("How many dollars will be bought? " + reais);
        System.out.println("Amount to be paid in reais = " + CurrencyConverter.amoutToPay(dolar, reais));
        System.out.println("ADICIONANDO UMA LINHA");
    }
}

public class Main {
    public static void main(String[] args) {
        CreditPaymentService CrPaSe = new CreditPaymentService();
        System.out.println("Первый скрин, ваш ежемесячный платеж:");
        System.out.println((CrPaSe.calculate(1_000_000, 9.99F, 1)) + " руб.");
        System.out.println("Первый скрин, ваш ежемесячный платеж:");
        System.out.println((CrPaSe.calculate(1_000_000, 9.99F, 2)) + " руб.");
        System.out.println("Первый скрин, ваш ежемесячный платеж:");
        System.out.println((CrPaSe.calculate(1_000_000, 9.99F, 3)) + " руб.");

    }
}

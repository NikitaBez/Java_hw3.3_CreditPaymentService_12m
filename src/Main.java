public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthlyPayment = service.calculate(1_000_000,12, 9.99);
        System.out.format( "Ежемесячный платёж, руб.: %.0f", monthlyPayment);
    }
}

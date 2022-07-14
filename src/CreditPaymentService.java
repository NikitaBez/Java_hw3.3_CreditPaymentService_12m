public class CreditPaymentService {
    public double calculate(double creditAmount, double creditTermInMonth, double percent) {
        double monthPercent= percent / ( 100 * 12);

        double onePlusMonthPercent = 1 + monthPercent;
        double minusCreditTermMonth = 0 - creditTermInMonth;
        double exponentiation = (Math.pow(onePlusMonthPercent, minusCreditTermMonth));
        double denominator = 1 - exponentiation;
        return creditAmount * ( monthPercent / denominator);
    }

}
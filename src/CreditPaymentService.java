public class CreditPaymentService {
    public int calculate(int sumOfCredit, double creditYearRate, int termsPaymentMonth) {
        double creditMonthRate = creditYearRate / 12 / 100;
        double x = (creditMonthRate * (Math.pow(1 + creditMonthRate, termsPaymentMonth))) / (Math.pow(1 + creditMonthRate, termsPaymentMonth)-1);
        double result = x * sumOfCredit;

        return (int) result;

    }
}

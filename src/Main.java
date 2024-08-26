public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sumOfCredit = 1000_000;
        double creditYearRate = 9.99;
        int termsPaymentMonth = 12;

        int everyMonthPayment = service.calculate(sumOfCredit, creditYearRate, termsPaymentMonth);
        System.out.println(everyMonthPayment);

        System.out.println();
        System.out.println("1000_000, 9.99, 24");
        System.out.println(service.calculate(1000_000, 9.99, 24));

        System.out.println();
        System.out.println("1000_000, 9.99, 36");
        System.out.println(service.calculate(1000_000, 9.99, 36));

        System.out.println();
        System.out.println("300_000, 11.99, 12");
        System.out.println(service.calculate(300_000, 11.99, 12));
    }
}

public class CreditPaymentService {
    public int calculate (double annualInterest, int loan, int time){
        double monthlyInterest = annualInterest / 12 / 100;
        double monthlyPayment = loan * monthlyInterest * Math.pow ((1 + monthlyInterest), time) / (Math.pow ((1 + monthlyInterest), time) - 1);
        return (int) monthlyPayment;

    }
}

public class CreditPaymentService {
    public int calculate(int creditAmount, float interestRate, int creditTerm) {
        int creditTermForMonth = creditTerm * 12;
        float monthlyInterestRate = interestRate / (100 * 12);
        float toADegree = (float) Math.pow((1 + monthlyInterestRate), (creditTermForMonth * -1));
        float monthlyPayment = (creditAmount * (monthlyInterestRate / (1 - toADegree)));
        return (int) monthlyPayment;
    }
}

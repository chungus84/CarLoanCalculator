public class CarLoanCalculator {
    /** class to calculate a persons payment for a car loan*/
    public static void main(String[] args) {

        int carLoan = 10000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;

        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment > carLoan) {
            System.out.println("The car can be payed in full");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
        }
    }
}

public class CarLoanCalculator {
    /** class to calculate a persons payment for a car loan*/

    // class variables
    int carLoan;
    int loanLength;
    int interestRate;
    int downPayment;

    // Constructor
    public CarLoanCalculator(int loanAmount, int loanLengthYears, int loanInterestRate, int loanDownPayment) {
        carLoan = loanAmount;
        loanLength = loanLengthYears;
        interestRate = loanInterestRate;
        downPayment = loanDownPayment;

        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment > carLoan) {
            System.out.println("The car can be payed in full");
        }
    }

    public int calcRemainingBalance() {
        /** class method returns the remaining balance */
        return carLoan - downPayment;
    }

    public int monthsRemaining() {
        /** class method returns the number of months remaining for the car loan duration */
        return loanLength * 12;
    }

    public int calcMonthlyBalance(int balance, int remMonths) {
        /** calculates the monthly balance for a loan W/O interest*/
        return balance / remMonths;
    }

     public int calcInterest(int monthlyBal) {
        /** calculates the interest amount per month */
        return monthlyBal * interestRate / 100;
     }

     public int calcMonthlyPayment() {
        /** calculates the monthly payment per month including interest */
        int monthlyBalance = calcMonthlyBalance(calcRemainingBalance(), monthsRemaining());
        int interest = calcInterest(monthlyBalance);
        return monthlyBalance + interest;
     }


    public static void main(String[] args) {

        // Instance to test should come to 233
        CarLoanCalculator loanee1 = new CarLoanCalculator(10000, 3, 5, 2000);
        System.out.println(loanee1.calcMonthlyPayment());

    }
}

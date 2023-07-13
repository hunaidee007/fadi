

public class SavingsAccount extends Account{



    public SavingsAccount(String name, int balance, int yearOfBirthVar) {
        super(name,balance,yearOfBirthVar);

    }

    @Override
    public int withdraw(int amount) throws Exception {

        if(balance-amount <= 100) {
            throw new Exception("Cannot Withdraw");
        } else {
            balance = balance - amount;
            return amount;
        }


    }

}

public class MainClass {

    public static void main (String args [] ) throws Exception {

     Account account = new Account("M", 100,1985);
     Account account1 = new Account("A", 500,1990);

     System.out.println(account1.getAge());

     System.out.println(account.getAge());

     SavingsAccount savingsAccount = new SavingsAccount("A", 500,1990);

     savingsAccount.withdraw(400);


    }

}

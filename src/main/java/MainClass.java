public class MainClass {

    public static void main (String args [] ) throws Exception {

    /* Account account = new Account("M", 100,1985);
     Account account1 = new Account("A", 500,1990);

     System.out.println(account1.getAge());

     System.out.println(account.getAge());*/

     SavingsAccount savingsAccount = new SavingsAccount("A", 500,1990);

     //savingsAccount.withdraw(400);
        int a = 5;
        System.out.println(a);
        doSomething(a);
        System.out.println(a);

        doSomethingWithAccount(savingsAccount);

        System.out.println(savingsAccount.getBalance());


    }


    public static void doSomethingWithAccount(SavingsAccount tempAccount){ /// SavingsAccount tempAccount = savingsAccount;
        tempAccount.balance=600;
    }

    public static void doSomething(int i) { //int i = a;
        System.out.println(i);
        i++;
        System.out.println(i);
    }

}

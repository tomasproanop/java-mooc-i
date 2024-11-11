
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matt = new Account("Matthews account", 1000.00);
        Account mine = new Account("My account", 0);

        matt.withdrawal(100.00);
        mine.deposit(100.00);

        System.out.println(matt);
        System.out.println(mine);



    }
}

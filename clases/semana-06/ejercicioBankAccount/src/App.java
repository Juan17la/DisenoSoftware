public class App {
    public static void main(String[] args) throws Exception {

        BankAccount account1 = new BankAccount(1000.00, "John Doe");

        System.out.println(account1.getBalance());
        System.out.println(account1.getAccountHolder());
        System.out.println(account1);
        
        account1.setBalance(-500.0);
        System.out.println(account1.getBalance());
    }
}

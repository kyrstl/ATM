import java.io.FileNotFoundException;

public class tester {
    public static void main (String[] args) throws FileNotFoundException {
        ATM test = new ATM();
        test.openAccount("testemail@gmail.com", 200);
        test.openAccount("test2@gmail.com", 500);
        test.audit();
        
        test.withdrawMoney("testemail@gmail.com", 50);
        System.out.println("test1 balance: " + test.checkBalance("testemail@gmail.com"));

        test.depositMoney("test2@gmail.com", 600);
        System.out.println("test2 balance: " + test.checkBalance("test2@gmail.com"));

        test.openAccount("test3@gmail.com", 100);
        test.transferMoney("test2@gmail.com", "test3@gmail.com", 20);
        System.out.println("test3 balance: " + test.checkBalance("test3@gmail.com"));
        System.out.println("test2 balance: " + test.checkBalance("test2@gmail.com"));

        test.audit();
    }
}
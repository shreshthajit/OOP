package atm;

import java.util.logging.Level;
import java.util.logging.Logger;

class cash {

    private int Bank_balance = 100000;

    synchronized void withDraw(int amount) {

        System.out.println("withdrawing-->");
        System.out.println("Current Bank's balance is " + Bank_balance);
        if (Bank_balance < amount) {

            try 
            {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(cash.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Bank_balance -= amount;

        System.out.println("withdraw completed...");
        System.out.println("Current Bank's balance is " + Bank_balance);

    }

}

class client extends Thread 
{

    cash bank;
    int amount;

    public client(cash bank, int amount) 
    {
        this.bank = bank;
        this.amount = amount;
    }
    public void run() {
        bank.withDraw(amount);
    }
}

public class Atm 
{

    public static void main(String[] args) 
    {
        cash bank = new cash();

        client customer1 = new client(bank, 1000);
        client customer2 = new client(bank, 500);
        client customer3 = new client(bank, 1500);
        client customer4 = new client(bank, 2000);

        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();
    }
}

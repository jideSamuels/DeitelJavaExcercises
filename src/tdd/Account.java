package tdd;

public class Account {
    private int balance;
    public void deposit(int amount) {
        if(amount >0) {
            balance = balance + amount;
        }
    }

    public int getBalance(){
        return balance;
    }

    public void withraw(int amount) {
        balance = balance + amount;
    }
}

package facade;

public class cash implements template {

    private double balance;

    public cash(double amount) {
        this.balance = amount;
    }

    @Override
    public void pay(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        }
        else {
            System.out.println("$" + this.balance + " in cash, $" + amount  + " cannot be payed" );
        }
    }

    @Override
    public void receive(double amount) { ; }

    public double getBalance() { return this.balance; }
}


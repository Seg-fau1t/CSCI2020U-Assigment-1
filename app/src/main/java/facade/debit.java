package facade;

public class debit implements template {

    private double balance;

    public debit(double amount) {
        this.balance = amount;
    }

    @Override
    public void pay(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        }
        else {
            System.out.println("$" + this.balance + " in account, $" + amount  + " cannot be withdrawn" );
        }
    }

    @Override
    public void receive(double amount) { this.balance += amount; }
    
    public double getBalance() { return this.balance; }
}


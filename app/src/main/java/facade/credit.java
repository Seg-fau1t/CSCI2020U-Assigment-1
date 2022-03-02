package facade;

public class credit implements template {

    private double balance;

    public credit(double amount) {
        this.balance = amount;
    }

    @Override
    public void pay(double amount) { this.balance -= amount; }

    @Override
    public void receive(double amount) { this.balance += amount; }

    public double getBalance() { return this.balance; }
}


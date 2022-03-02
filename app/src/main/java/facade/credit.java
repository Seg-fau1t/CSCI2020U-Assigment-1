package facade;

public class credit implements template {

    // The amount of money stored in the instance
    private double balance;

    /**
     * This function will handle all of the necessary steps to attempt to 
     * transfer the money out of the sub-class that called it.
     *
     *@param amount a double containing the amount to be transferred
     *@return void
     */
    public credit(double amount) {
        this.balance = amount;
    }

    /**
     * This function will handle all of the necessary steps to attempt to 
     * transfer the money out of the instance that called it.
     *
     *@param amount a double containing the amount to be transferred
     *@return void
     */
    @Override
    public void pay(double amount) { this.balance -= amount; }

    /**
     * This function will handle all of the necessary steps to attempt to 
     * transfer the money in to the instance that called it.
     *
     *@param amount a double containing the amount to be transferred
     *@return void
     */
    @Override
    public void receive(double amount) { this.balance += amount; }

    /**
     * Gives the current value of the instances balance
     *
     *@return this.balance
     */
    public double getBalance() { return this.balance; }
}


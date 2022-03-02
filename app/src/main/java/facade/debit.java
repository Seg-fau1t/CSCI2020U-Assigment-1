package facade;

public class debit implements template {

    // The amount of money stored in the instance
    private double balance;

    /**
     * This function will set the initial amount on the card
     *
     *@param amount a double containing the amount to be deposited
     *@return void
     */
    public debit(double amount) {
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
    public void pay(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        }
        else {
            System.out.println("$" + this.balance + " in account, $" + amount  + " cannot be withdrawn" );
        }
    }

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


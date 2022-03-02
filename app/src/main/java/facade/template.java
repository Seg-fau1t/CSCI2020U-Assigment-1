package facade;

public interface template {
    
    /**
     * This is the virtual class that will be implemented for all sub-classes.
     * It will handle all of the necessary steps to attempt to transfer the
     * money out of the sub-class that called it.
     *
     *@param amount a double containing the amount to be transferred
     *@return void
     */
    void pay(double amount);

    /**
     * This is the virtual class that will be implemented for all sub-classes.
     * It will handle all of the necessary steps to attempt to transfer the
     * money into the sub-class that called it.
     *
     *@param amount a double containing the amount to be transferred
     *@return void
     */
    void receive(double amount);

    /**
     * will return the balance of the object that called it 
     *
     *@return double
     */
    double getBalance();
}


//creates customer object type for question 1
public class Customer {
    //private variables for the class
    private String name;
    private double balance;

    //creates a new instance of Customer
    public Customer (String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    //returns a customer's name and balance
    public String toString(){
        String info = "The customer's name is: " + name + " and their balance is: " + balance;
        return info;
    }

    //returns customer's name
    public String getName(){
        return name;
    }

    //returns customer's balance
    public double getBalance(){
        return balance;
    }

    //adds a given percentage to a customers balance
    public void addPercentage(double percent){
        balance = balance * percent;
    }
}

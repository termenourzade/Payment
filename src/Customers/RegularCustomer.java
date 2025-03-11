package Customers;

public class RegularCustomer extends Customer {
    public RegularCustomer(String name) {
        super(name);
    }

    @Override
    public void displayCustomerInfo() {
        System.out.println("name; " + super.name + "    customer type: regular");

    }
}

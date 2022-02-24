package coffeehouse.entities;

public class Customer extends Users{
    private double withdraw = 500;

    public Customer(int id , String name){
        super(id , name);
    }

    public Customer(){}
    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public double payToOrder(double p){

        return payToOrder(p) - getWithdraw();

    }
}

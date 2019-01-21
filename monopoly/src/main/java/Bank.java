public class Bank {

    private int amount;

    public Bank(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }

    public void addAmount(int amount){
        this.amount += amount;
    }

    public void removeAmount(int amount){
        this.amount -= amount;
    }
}

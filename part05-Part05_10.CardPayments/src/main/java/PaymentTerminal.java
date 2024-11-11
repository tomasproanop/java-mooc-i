
public class PaymentTerminal {

    private double money = 1000;  // amount of cash
    private int affordableMeals = 0; // number of sold affordable meals
    private int heartyMeals = 0;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000.00;
        // register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= 2.5){
            this.money = money + 2.5;
            payment = payment - 2.5;
            affordableMeals += 1;
       }
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= 4.3){
            this.money = money + 4.3;
            payment = payment - 4.3;
            heartyMeals += 1;
       }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned

        if (card.balance() >= 2.5){
            affordableMeals += 1;
            return card.takeMoney(2.5);
       }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned

        if (card.balance() >= 4.3){
            heartyMeals += 1;
            return card.takeMoney(4.3);       }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
       
        if (sum > 0){
        this.money = money + sum;
        card.addMoney(sum);
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}

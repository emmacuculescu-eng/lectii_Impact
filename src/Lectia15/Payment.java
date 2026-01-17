package Lectia15;
interface Payment {
    void processPayment(double amount);
}

class CashPayment implements Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("The amount of " + amount + "$ was paid by cash.");
    }
}

class CardPayment implements Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("The amount of " + amount + "$ was paid by card");
    }
}

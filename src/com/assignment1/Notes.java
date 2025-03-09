package com.assignment1;

public class Notes {
    private int quantityOnHand;
    private final int denomination;

    public Notes(int denomination) {
        quantityOnHand = 0;
        this.denomination = denomination;
    }

    public int getTotalValue() {
        return denomination * quantityOnHand;
    }

    public void increaseQuantity(int quantity) {
        quantityOnHand += quantity;
    }

    public void decreaseQuantity(int quantity) {
        quantityOnHand -= quantity;
        if (quantityOnHand < 0) {
            quantityOnHand = 0;
        }
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public String printPretty(float amount) {
        return ("$" + String.format("%4.2f", amount));
    }

    @Override
    public String toString() {
        return printPretty(getTotalValue()) + " in " + printPretty(denomination) + " notes.";
    }
}
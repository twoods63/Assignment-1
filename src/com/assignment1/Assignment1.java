package com.assignment1;

import java.util.*;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Notes twenties = new Notes(20);
        Notes tens = new Notes(10);
        Notes fives = new Notes(5);
        Notes ones = new Notes(1);

        Coins quarters = new Coins(0.25f, 0.2f);
        Coins dimes = new Coins(0.10f, 0.08f);
        Coins nickels = new Coins(0.05f, 0.176f);
        Coins pennies = new Coins(0.01f, 0.088f);

        dimes.increaseQuantity(41);
        nickels.increaseQuantity(17);
        pennies.increaseQuantity(132);
        ones.increaseQuantity(33);
        fives.increaseQuantity(12);
        tens.increaseQuantity(2);
        twenties.increaseQuantity(5);

        System.out.println(twenties);
        System.out.println(tens);
        System.out.println(fives);
        System.out.println(ones);
        System.out.println(quarters);
        System.out.println(dimes);
        System.out.println(nickels);
        System.out.println(pennies);

        float totalMoney = twenties.getTotalValue() + tens.getTotalValue() + fives.getTotalValue() + ones.getTotalValue() + quarters.getTotalValue() + dimes.getTotalValue() + nickels.getTotalValue() + pennies.getTotalValue();

        float totalWeight = quarters.getTotalWeight() + dimes.getTotalWeight() + nickels.getTotalWeight() + pennies.getTotalWeight();

        System.out.printf("Total Money is $%.2f total weight is %.3foz\n", totalMoney, totalWeight);

        System.out.println("How much do you need?");
        float amount = sc.nextFloat();

        while (amount >= 20 && twenties.getQuantityOnHand() > 0) {
            twenties.decreaseQuantity(1);
            System.out.println("Give them a $20 note");
            amount -= 20;
        }
        while (amount >= 10 && tens.getQuantityOnHand() > 0) {
            tens.decreaseQuantity(1);
            System.out.println("Give them a $10 note");
            amount -= 10;
        }
        while (amount >= 5 && fives.getQuantityOnHand() > 0) {
            fives.decreaseQuantity(1);
            System.out.println("Give them a $5 note");
            amount -= 5;
        }
        while (amount >= 1 && ones.getQuantityOnHand() > 0) {
            ones.decreaseQuantity(1);
            System.out.println("Give them a $1 note");
            amount--;
        }
        while (amount >= 0.25 && quarters.getQuantityOnHand() > 0) {
            quarters.decreaseQuantity(1);
            System.out.println("Give them a quarter");
            amount -= 0.25f;
        }
        while (amount >= 0.10 && dimes.getQuantityOnHand() > 0) {
            dimes.decreaseQuantity(1);
            System.out.println("Give them a dime");
            amount -= 0.10f;
        }
        while (amount >= 0.05 && tens.getQuantityOnHand() > 0) {
            nickels.decreaseQuantity(1);
            System.out.println("Give them a nickel");
            amount -= 0.05f;
        }
        while (amount >= 0.01 && pennies.getQuantityOnHand() > 0) {
            pennies.decreaseQuantity(1);
            System.out.println("Give them a penny");
            amount -= 0.01f;
        }
        if (amount > 0.001) {
            System.out.printf("I don't have enough money. I still owe you $%.2f\n", amount);
            totalMoney = 0.00f;
            totalWeight = 0f;
            System.out.printf("I have $%.2f left, it's total weight is %.0foz", totalMoney, totalWeight);
        }
        totalMoney = twenties.getTotalValue() + tens.getTotalValue() + fives.getTotalValue() + ones.getTotalValue() + quarters.getTotalValue() + dimes.getTotalValue() + nickels.getTotalValue() + pennies.getTotalValue();
        totalWeight = quarters.getTotalWeight() + dimes.getTotalWeight() + nickels.getTotalWeight() + pennies.getTotalWeight();
        if (amount < 0.001) {
            System.out.printf("I have $%.2f left, it's total weight is %.3foz\n", totalMoney, totalWeight);
        }
    }
}
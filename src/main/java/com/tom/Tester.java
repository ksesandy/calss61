package com.tom;

public class Tester {
    public static void main(String[] args) {
        Customer customer = new Customer("Andy", 788);
        System.out.println(customer.id + "\t" +
                customer.amount + "\t" + customer.getTotal());
        SilverCustomer mary = new SilverCustomer("Mary", 1000);
        System.out.println(mary.id + "\t" +
                mary.amount + "\t" + mary.getTotal());
    }
}

package com.tom.customer;

import com.tom.student.Mailer;

public class SilverCustomer
        extends Customer
        implements Mailer {
    float discount = 0.1f;

    public SilverCustomer(String id, int amount) {
        super(id, amount);
    }
    @Override
    public int getTotal() {
        return amount - (int)(amount * discount);
    }

    @Override
    public void mail() {

    }
}

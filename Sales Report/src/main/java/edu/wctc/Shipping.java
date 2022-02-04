package edu.wctc;

public class Shipping implements ShippingPolicy {
    @Override
    public Float getShipping(SalesData salesData) {
        return 0.05f;
    }
}

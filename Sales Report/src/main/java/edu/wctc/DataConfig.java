package edu.wctc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataConfig {
    @Autowired
    private SalesDataProvider salesDataProvider;
    @Autowired
    private DataFormatter dataFormatter;
    @Autowired
    private ShippingPolicy shippingPolicy;
    //is everything routing to here?


    public void processSalesData() {
        List<SalesData> list = salesDataProvider.getSalesData();

        String aData = dataFormatter.format(list);
        Float bData = shippingPolicy.getShipping(new SalesData());

        System.out.println(aData + bData);
    }
}

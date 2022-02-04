package edu.wctc;

import edu.wctc.SalesData;

import java.util.List;

public interface SalesDataProvider {
    List<SalesData> getSalesData();
}

package edu.wctc;

import edu.wctc.DataFormatter;
import edu.wctc.SalesData;

import java.util.List;

public class SDataFormatter implements DataFormatter {
    @Override
    public String format(List<SalesData> list){
        StringBuilder sb = new StringBuilder();

        for (SalesData data : list){
            sb.append(data.getName());
            sb.append(",");
            sb.append(data.getCountry());
            sb.append(",");
            sb.append(data.getAmount());
            sb.append(",");
            sb.append(data.getTax());
            sb.append(",");
            sb.append(data.getAmount() * .05f);
            sb.append("\n");


        }
        return sb.toString();
    }
}

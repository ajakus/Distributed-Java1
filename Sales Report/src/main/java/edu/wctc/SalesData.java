package edu.wctc;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class SalesData {
    private String Name;
    private String Country;
    private Float Amount;
    private Float tax;
    private Float Shipping;
}

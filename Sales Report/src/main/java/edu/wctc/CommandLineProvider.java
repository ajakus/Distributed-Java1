package edu.wctc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandLineProvider implements SalesDataProvider {
    @Override
    public List<SalesData> getSalesData(){
        List<SalesData> list = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        String response = "y";

        while (response.equalsIgnoreCase("y")){
            System.out.println("Enter Your first and last name: ");
            String name = keyboard.nextLine();

            System.out.println("Enter Your Country of Origin: ");
            String country = keyboard.nextLine();

            System.out.println("Enter the item total: ");
            float amount = Float.parseFloat(keyboard.nextLine());

            System.out.println("Enter the tax: ");
            float tax = Float.parseFloat(keyboard.nextLine());

            SalesData SData = new SalesData();
            SData.setName(name);
            SData.setCountry(country);
            SData.setAmount(amount);
            SData.setTax(tax);

            list.add(SData);

            System.out.println("Add another record ? y/n");
            response = keyboard.nextLine();

        }
        return list;

    }
}

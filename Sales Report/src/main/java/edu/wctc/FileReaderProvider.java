package edu.wctc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReaderProvider implements SalesDataProvider {
    @Override
    public List<SalesData> getSalesData(){
        List<SalesData> list = new ArrayList<>();
        File file = new File("sales.txt");
        try {
            Scanner reader = new Scanner(file);

            while(reader.hasNext()){
                String line = reader.nextLine();
                String[] contents = line.split(",");
                SalesData SData = new SalesData();

                SData.setName(contents[0]);
                SData.setCountry(contents[1]);
                SData.setAmount(Float.parseFloat(contents[2]));
                SData.setTax(Float.parseFloat(contents[3]));

                list.add(SData);


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}

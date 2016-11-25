package util;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pasindutennage on 11/25/16.
 */
public class csvReader {

    public static void main (String [] args) throws Exception{
        CSVReader reader = new CSVReader(new FileReader("/home/pasindutennage/Coding/Whack/WHACK-Predetors/dashboard/home/csv/yourfile.csv"));

        List<String []> myEntries = reader.readAll();
        for(String [] array : myEntries){
            String [] details = array[0].split("\t");
            System.out.println("Company:" + details[0] +"Country:" + details[1]+ "Time:" +details[2]);
        }
    }
}

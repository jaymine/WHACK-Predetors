package util;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.util.List;

/**
 * Created by pasindutennage on 11/25/16.
 */
public class csvReader {

    public String  read () {
        String data = "[";

        try {
            CSVReader reader = new CSVReader(new FileReader("home/csv/yourfile.csv"));


            List<String[]> myEntries = reader.readAll();
            for (String[] array : myEntries) {
                data += "{";
                data += ("name: '" + array[0] + "',");
                data += ("time: '" + array[1] + "',");
                data += ("country: '" + array[2] + "',");
                data += ("p: '" + array[3] + "'");

                data += "},";
            }
            data += "]";


            return data;
        }
        catch(Exception ex){return null;}

    }

    public String  getTime (String name) {

        try {
            CSVReader reader = new CSVReader(new FileReader("home/csv/yourfile.csv"));


            List<String[]> myEntries = reader.readAll();
            for (String[] array : myEntries) {
                if(array[0].equals(name)){
                    return array[1];
                }
            }

        }
        catch(Exception ex){return "0";}
        return "0";
    }

    public String  getP (String name) {

        try {
            CSVReader reader = new CSVReader(new FileReader("home/csv/yourfile.csv"));


            List<String[]> myEntries = reader.readAll();
            for (String[] array : myEntries) {
                if(array[0].equals(name)){
                    return array[3];
                }
            }

        }
        catch(Exception ex){return "0";}
        return "0";
    }

}

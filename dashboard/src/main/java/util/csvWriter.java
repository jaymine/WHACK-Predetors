package util;

/**
 * Created by pasindutennage on 11/25/16.
 */

import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileWriter;



public class csvWriter {
    public  void write(String [] args )  {

        try{
        CSVWriter writer = new CSVWriter(new FileWriter("home/csv/yourfile.csv"), '\t');
        // feed in your array (or convert your data to an array)
        writer.writeNext(args);
        writer.close();}catch(Exception ex){}
    }
}

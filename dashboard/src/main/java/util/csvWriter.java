package util;

/**
 * Created by pasindutennage on 11/25/16.
 */

import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;



public class csvWriter {
    public static void main(String [] args ) throws Exception{

        CSVWriter writer = new CSVWriter(new FileWriter("/home/pasindutennage/Coding/Whack/WHACK-Predetors/dashboard/home/csv/yourfile.csv"), '\t');
        // feed in your array (or convert your data to an array)
        String[][] entries ={ {"CompanyA","CountryA","TimeA"},
                {"CompanyB","CountryB","TimeB"},
                {"CompanyC","CountryC","TimeC"},
                {"CompanyD","CountryD","TimeD"},
                {"CompanyE","CountryE","TimeE"},
                {"CompanyF","CountryF","TimeF"},
                {"CompanyG","CountryG","TimeG"},
                {"CompanyH","CountryH","TimeH"}


        };
        for (String [] entry : entries) {
            writer.writeNext(entry);
        }
            writer.close();
    }
}

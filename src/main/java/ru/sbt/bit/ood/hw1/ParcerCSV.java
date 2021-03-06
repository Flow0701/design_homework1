package ru.sbt.bit.ood.hw1;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Stratilov on 09.11.2016.
 */
public class ParcerCSV {
    static public Iterable<CSVRecord> parse(String filename) {
        try {
            Reader in = new FileReader(filename);
            Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
            return records;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("There was an error while parsing CSV file");
        }
    }
}

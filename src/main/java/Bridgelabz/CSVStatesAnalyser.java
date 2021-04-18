package Bridgelabz;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class CSVStatesAnalyser {
    public int loadStatesCodeData(String csvFilePath) throws CSVStatesException {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(csvFilePath));
            CsvToBeanBuilder<CSVStates> csvToBeanBuilder = new CsvToBeanBuilder<>(reader);
            csvToBeanBuilder.withType(CSVStates.class);
            csvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
            CsvToBean<CSVStates> csvToBean = csvToBeanBuilder.build();
            Iterator<CSVStates> statesCSVIterator = csvToBean.iterator();
            int numOfEntries = 0;
            while (statesCSVIterator.hasNext()) {
                numOfEntries++;
                statesCSVIterator.next();
            }
            return numOfEntries;
        } catch (IOException e) {
            throw new CSVStatesException(e.getMessage(),
                    CSVStatesException.ExceptionTypeStates.CSV_FILE_PROBLEM);
        } catch (RuntimeException e){
            throw new CSVStatesException(e.getMessage(),
                    CSVStatesException.ExceptionTypeStates.DATA_FORMAT_PROBLEM);
        }
    }
}
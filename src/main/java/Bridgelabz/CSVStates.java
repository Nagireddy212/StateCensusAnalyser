package Bridgelabz;

import com.opencsv.bean.CsvBindByName;

public class CSVStates {
    @CsvBindByName(column = "SrNo", required = true)
    public int serialNumber;

    @CsvBindByName(column = "TIN", required = true)
    public int tin;

    @CsvBindByName(column = "StateCode", required = true)
    public String stateCode;

    @CsvBindByName(column = "StateName", required = true)
    public String stateName;

    @Override
    public String toString() {
        return "CSVStates{" +
                "serialNumber=" + serialNumber +
                ", tin=" + tin +
                ", stateCode='" + stateCode + '\'' +
                ", stateName='" + stateName + '\'' +
                '}';
    }
}
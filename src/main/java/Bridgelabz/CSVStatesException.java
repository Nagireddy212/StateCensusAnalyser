package Bridgelabz;

public class CSVStatesException extends Exception{
    enum ExceptionTypeStates {
        CSV_FILE_PROBLEM , DATA_FORMAT_PROBLEM
    }

    ExceptionTypeStates type;

    public CSVStatesException(String message, ExceptionTypeStates type) {
        super(message);
        this.type = type;
    }

    public CSVStatesException(String message, ExceptionTypeStates type, Throwable cause) {
        super(message, cause);
        this.type = type;
    }
}
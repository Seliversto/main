package homewokr5.calculator;

public class FileLogger implements Logger {

    @Override
    public void log(String message) {

        System.out.println("Log into file: " + message);
    }
}

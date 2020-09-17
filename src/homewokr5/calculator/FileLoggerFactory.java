package homewokr5.calculator;

public class FileLoggerFactory implements LoggerFactory {

    @Override
    public Logger getLogger() {return new FileLogger();}
}

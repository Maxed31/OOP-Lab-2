package week7.FirstTask;

public class Main {
    public static void main(String []args){
        RecordLogger recordLogger = new RecordLogger("Armin");
        ClassLogger classLogger = new ClassLogger("Azur");

        Logger recordLoggerMessage = (String message) -> recordLogger.logMessage(message);
        Logger classLoggerMessage = (String message) -> classLogger.logMessage(message);

        System.out.println(recordLoggerMessage.logMessage("VASA KAFA JE GOTOVA"));
        System.out.println(classLoggerMessage.logMessage("VASA KAFA NIJE GOTOVA"));


    }
}

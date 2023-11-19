package week7.FirstTask;

import week7.FirstTask.Logger;

public record RecordLogger (String name)implements Logger {



    @Override
    public String logMessage(String message) {
        return message + ' ' + name;
    }
}

package week7.FirstTask;

public class ClassLogger implements Logger {

    private String name;

    public ClassLogger(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String logMessage(String message) {
        return message + ' ' + this.name;
    }
}

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try{
            Tasks.task1();
        }
        catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}

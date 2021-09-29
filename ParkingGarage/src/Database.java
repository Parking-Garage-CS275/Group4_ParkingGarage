import java.io.*;

/*
 * What Database Data we are storing:
 * ID Number, FirstName, LastName, Parking Spot Number, Time/Date Entered, Paid?
 */


public class Database {
    private String FILENAME;
    private File DATA;
    
    /*
    Constructor Method;
    Takes the Filename puts into private object variable, called FILENAME.
    DATA, another private object variable, makes the file object so it can be
    read and writen to.
    
    Param: String _fileName takes the name of the file
    */
    public Database(String _fileName){
        FILENAME = _fileName;
        
        DATA = new File(FILENAME);
    }
    
    public static void writeToFile(){
        
    }
}

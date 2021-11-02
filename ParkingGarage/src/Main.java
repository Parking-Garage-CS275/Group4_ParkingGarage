
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;




public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        
        /*
        This how to read the file and get the data into a arraylist
        Database File = new Database("src/Database.txt");
        Arraylist<Customer> CustomerData = File.getCustomers();
        
        Use method writeToFile() to close out the program so all the data is written to the file
        
        */
        
        Connect.connect();
        

    
   
        PGarage g1 = new PGarage();
        g1.getCCOunt();
        g1.countUp();
        g1.getCCOunt();
        g1.countUp();
        g1.getCCOunt();
        g1.countDown();
        g1.getCCOunt();
        g1.getTSpaces();
              

    }
}

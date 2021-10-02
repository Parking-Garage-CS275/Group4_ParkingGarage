import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * What Database Data we are storing:
 * ID Number, FirstName, LastName, Parking Spot Number, Time/Date Entered, Paid?
 */


public class Database {
    private static String FILENAME;
    private static File DATAFILE;
    private static ArrayList<Customer> CUSTOMERS = new ArrayList<Customer>();
    
    /*
    Constructor Method;
    Takes the Filename puts into private object variable, called FILENAME.
    DATA, another private object variable, makes the file object so it can be
    read and writen to.
    
    Param: String _fileName takes the name of the file
    */
    public Database(String _fileName){
        FILENAME = _fileName;
        
        DATAFILE = new File(FILENAME);
        
        readFile();
    }
    
    /*
    TODO: This should work if the CUSTOMER ARRAYLIST WORKS.
    */
    public static void writeToFile(){
        try {
            FileWriter DataWriter = new FileWriter(FILENAME);
            for(int i = 0; i < CUSTOMERS.size(); i++){
                DataWriter.write(CUSTOMERS.get(i) + "\n");
                System.out.println(CUSTOMERS.get(i));
            }
            DataWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("A WRITE error has occurred.");
            e.printStackTrace();
        }
    }
    
    /*
    Read File Method, used with the constructor, to store all the customers in
    an arraylist for easy access when running the program.
    */
    private static void readFile(){
        try{
            Scanner reader = new Scanner(DATAFILE);
            while(reader.hasNextLine()){
                //System.out.println(reader.nextLine());
                String data = reader.nextLine();
                CUSTOMERS.add(new Customer(data));
                //System.out.println(data);
            }
            //TODO: The arraylist wont hold the correct customer data and will only
            //      hold the last customer inputed from the file.
            for(int i = 0; i < CUSTOMERS.size(); i++){
                System.out.println(CUSTOMERS.get(i) + "\n");
            }
        } catch (FileNotFoundException e){
            System.out.println("A READ error has occured: ");
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Customer> getCustomers(){
        return CUSTOMERS;
    }
}

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
    private static ArrayList<Customer> CUSTOMER = new ArrayList<Customer>();
    
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
        
        CUSTOMER = readFile();
    }
    
    /*
    
    */
    public static void writeToFile(){
        try {
            FileWriter DataWriter = new FileWriter(FILENAME);
            for(int i = 0; i < CUSTOMER.size(); i++){
                DataWriter.write(CUSTOMER.get(i) + "\n");
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
    private static ArrayList<Customer> readFile(){
        ArrayList<Customer> lines = new ArrayList<Customer>();
        try{
            Scanner reader = new Scanner(DATAFILE);
            while(reader.hasNextLine()){
                //System.out.println(reader.nextLine());
                Customer id = new Customer(reader.nextLine());
                //System.out.println(id);
                lines.add(id);
            }
            for(Customer i: lines){
                System.out.println(i);
            }
        } catch (FileNotFoundException e){
            System.out.println("A READ error has occured: ");
            e.printStackTrace();
        }
        
        return lines;
    }
    
    public static ArrayList<Customer> getCustomers(){
        return CUSTOMER;
    }
}

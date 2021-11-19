

import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;





public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        
        /*
        This how to read the file and get the data into a arraylist
        Database File = new Database("src/Database.txt");
        Arraylist<Customer> CustomerData = File.getCustomers();
        
        Use method writeToFile() to close out the program so all the data is written to the file
        
        */
        
        
       PGarage parkingGarage = new PGarage();
       
       //read in file and create new customers during runtime
       Database database = new Database("Database.txt");
       
       //fill the parking spot in the garage that the customer picks
       
       
       for(int i = 0 ; i < database.getCustomers().size() ; i++){
           parkingGarage.fillParkingSpot(database.getParkingSpot(i));
       }
       
       
       String start_date
                = "10-01-2018 01:10";

            // Given end Date
            String end_date
                = "05-17-2021 06:35";

            // Function Call
            
            String checkInTime = "10-01-2018 01:10" ; String checkOutTime = "05-17-2021 06:35";
            CalculateTime timeCalculator = new CalculateTime();
            long difference = (timeCalculator.findDifference(checkInTime, checkOutTime));
            
            System.out.println("");
       
       
       new start().setVisible(true);
       //long T1 = 101011122021;
      // Time.Duration(101011122021, 101011132021);
       
       
    }
}


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
       
       parkingGarage.showFilledSpots();
       
       System.out.println(parkingGarage.getCountFilledSpots());
        
       String spot1 = "A19";
       //System.out.println(parkingGarage.isSpotFilled(spot1));
    }
}

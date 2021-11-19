
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
       
       System.out.println("Number of spots currently filled: " + parkingGarage.getCountFilledSpots());
       
       System.out.println("\n");
       
       String spot1 = "A19";
       System.out.println(spot1);
       System.out.println(parkingGarage.isSpotFilled(spot1));
       
       String spot2 = "A20";
       System.out.println(spot2);
       System.out.println(parkingGarage.isSpotFilled(spot2));
       
       String spot3 = "C06";
       System.out.println(spot3);
       System.out.println(parkingGarage.isSpotFilled(spot3));
       
       String spot4 = "E12";
       System.out.println(spot4);
       System.out.println(parkingGarage.isSpotFilled(spot4));
       new start().setVisible(true);
       //long T1 = 101011122021;
      // Time.Duration(101011122021, 101011132021);
       
       
    }
}

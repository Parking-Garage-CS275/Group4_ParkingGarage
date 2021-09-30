import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
       Database ParkingData = new Database("src/Database.txt");
       ArrayList<Customer> CUSTOMERS = ParkingData.getCustomers();
       
       //ParkingData.writeToFile();
    }
}
